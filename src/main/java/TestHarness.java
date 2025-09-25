import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Scanner;

// PSVM
public class TestHarness {
    public static void main(String[] args) throws IOException, InterruptedException {
        String className;
        String testFolder;

        if (args.length >= 2) {
            className = args[0];
            testFolder = args[1];
        }
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter file name: ");
            className = scanner.nextLine().trim();
            System.out.print("Enter Test Folder (LabX.PartY): ");
            testFolder = scanner.nextLine().trim();
        }

        // Path to the file
        String filePath = "src/main/java/" + className.replace('.', '/') + ".java";
        String classNameOnly = className.substring(className.lastIndexOf('.') + 1);

        File javaFile = new File(filePath);
        if (!javaFile.exists()) {
            System.out.println("Failed to locate: " + javaFile.getPath());
            return;
        }

        // Compile the file with class output directed to temp folder
        System.out.println("Compiling File");
        new File("bin").mkdirs();
        Process compileProcess = Runtime.getRuntime().exec("javac -d bin " + filePath);
        compileProcess.waitFor();
        if (compileProcess.exitValue() != 0) {
            System.out.println("Compilation failed :(");
            printStream(compileProcess.getErrorStream());
            return;
        }

        // Locate Input and Output files
        File testDir = new File("src/main/resources/TestCases/" + testFolder.replace('.', '/'));
        if (!testDir.exists()) {
            System.out.println("Test Directory not found: " + testDir.getPath());
            return;
        }

        System.out.println("Looking for test files in: " + testDir.getAbsolutePath()); // TEMP
        File[] inputFiles = testDir.listFiles((dir, name) -> name.endsWith(".in"));
        if (inputFiles == null || inputFiles.length == 0) {
            //System.out.println("Test Files not found :(");
            System.out.println("No .in files found in: " + testDir.getAbsolutePath());
            return;
        }

        Arrays.sort(inputFiles);

        for (File inputFile : inputFiles) {
            String baseName = inputFile.getName().replace(".in", "");
            File outputFile = new File(testDir, baseName + ".out");

            if (!outputFile.exists()) {
                System.out.println("Missing output for " + inputFile.getName());
                continue;
            }

            System.out.println("Running program...");

            ProcessBuilder runBuilder = new ProcessBuilder("java", "-cp", "bin", className);
            Process runProcess = runBuilder.start();

            // Send Input data to the process
            OutputStream stdin = runProcess.getOutputStream();
            InputStream stdout = runProcess.getInputStream();
            InputStream stderr = runProcess.getErrorStream();

            byte[] inputData = Files.readAllBytes(inputFile.toPath());
            stdin.write(inputData);
            stdin.flush();
            stdin.close();

            // Sniff the Output
            String actualOutput = new String(stdout.readAllBytes()).trim();
            String expectedOutput = new String(Files.readAllBytes(outputFile.toPath())).trim();

            String[] expectedLines = expectedOutput.trim().split("\\R");
            String[] actualLines = actualOutput.trim().split("\\R");

            boolean match = true;
            switch(testFolder.toLowerCase()) {
                case "lab8.partb":
                    match = testLab8b(actualOutput);
                    if (match) {
                        System.out.println(baseName + " produced a random lowercase letter: " + actualOutput);
                    }
                    else {
                        System.out.println(baseName + " did not produce a random lowercase letter: " + actualOutput);
                    }
                    break;
                case "lab9.parta":
                    match = testLab9a(actualOutput);
                    if (match) {
                        System.out.println(baseName + " produced a random uppercase letter: " + actualOutput);
                    }
                    else {
                        System.out.println(baseName + " did not produce a random uppercase letter: " + actualOutput);
                    }
                    break;
                case "lab9.partb":
                    match = testLab9b(actualOutput);
                    if (match) {
                        System.out.println(baseName + " produced a valid DMV ID: " + actualOutput);
                    }
                    else {
                        System.out.println(baseName + " did not produce a valid DMV ID: " + actualOutput);
                    }
                    break;
                case "lab10.parta":
                    match = testLab10a(actualOutput);
                    if (match) {
                        System.out.println(baseName + " correctly produced 10 random numbers and their average.");
                    }
                    else {
                        System.out.println(baseName + " did not correctly produce 10 random number and their average.");
                    }
                    break;
                case "lab19.parta":
                    match = testLab19a(actualOutput);
                    if (match) {
                        System.out.println(baseName + " correctly counted the occurrences of 100 random numbers.");
                    }
                    else {
                        System.out.println(baseName + " did not correctly count the occurrences of 100 random numbers.");
                    }
                    break;
                default:
                    for (String expectedLine : expectedLines) {
                        boolean found = false;
                        for (String actualLine : actualLines) {
                            if (normalize(actualLine).contains(normalize(expectedLine))) {
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            match = false;
                            break;
                        }
                    }
                    break;
            }

            if (match) {
                System.out.println(baseName + " is correct!\n");
            }
            else {
                System.out.println(baseName + " did not produce the correct output.");
                System.out.println("Expected: " + expectedOutput);
                System.out.println("Got: " + actualOutput + "\n");
            }

            String errors = new String(stderr.readAllBytes()).trim();
            if (!errors.isEmpty()) {
                System.out.println("Errors: " + errors);
            }
        }
    }

    private static void printStream(InputStream stream) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }

    static String normalize(String s) {
        return s.trim().replaceAll("\\s", " ");
    }

    public static boolean testLab8b(String output) {
        return output.length() == 1 && output.charAt(0) >= 'a' && output.charAt(0) <= 'z';
    }

    public static boolean testLab9a(String output) {
        return output.length() == 1 && output.charAt(0) >= 'A' && output.charAt(0) <= 'Z';
    }

    public static boolean testLab9b(String output) { // Drivers License Number
        output = output.trim();
        if (output.length() != 7) {
            return false;
        }

        String letters = output.substring(0, 3);
        String numbers = output.substring(3);

        return letters.chars().allMatch(Character::isUpperCase) &&
                numbers.chars().allMatch(Character::isDigit);
    }

    public static boolean testLab10a(String output) {
        String[] lines = output.trim().split("\\R");
        if (lines.length != 2) {
            return false;
        }

        String[] nums = lines[0].trim().split("\\s+");
        if (nums.length != 10) {
            return false;
        }

        int sum = 0;
        for (String numString : nums) {
            try {
                int num = Integer.parseInt(numString);
                if (num < 0 || num >= 100) {
                    return false;
                }
                sum += num;
            }
            catch (NumberFormatException e) {
                return false;
            }
        }
        try {
            double reportedAverage = Double.parseDouble(lines[1]);
            double expectedAverage = sum / 10.0;
            return Math.abs(reportedAverage - expectedAverage) <= 0.001;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean testLab19a(String output) {
        String[] lines = output.trim().split("\\R");
        if (lines.length < 11) {
            return false;
        }

        String[] numbers = lines[0].trim().split("\\s+");
        if (numbers.length != 100) {
            return false;
        }

        int[] counts = new int[10];

        try {
            for (int i = 0; i < 100; i++) {
                int num = Integer.parseInt(numbers[i]);
                if (num < 0 || num > 9) {
                    return false;
                }
                counts[num]++;
            }
        }
        catch (NumberFormatException e) {
            return false;
        }

        for (int i = 1; i <= 10; i++) {
            String expectedLine = (i - 1) + " occurs " + counts[i - 1] + " times";
            if (!lines[i].trim().contains(expectedLine)) {
                return false;
            }
        }
        return true;
    }
}

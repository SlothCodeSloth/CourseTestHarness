import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestHarnessGUI {
    private File lastDirectory = new File("src/main/java");
    private JFrame frame;
    private JTextField classNameField;
    private JTextArea outputArea;
    JComboBox<String> labSelector;
    JComboBox<String> partSelector;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TestHarnessGUI().createAndShowGUI());
    }

    private void createAndShowGUI() {
        frame = new JFrame("Java Test Harness");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLayout(new BorderLayout());

        // Add Night Mode
        Color darkBackground = new Color (40, 44, 52);
        Color lightText = new Color (230, 230, 230);
        Color buttonBackground = new Color(60, 63, 65);

        // Top Panel with Input
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());
        topPanel.setBackground(darkBackground);

        JLabel label = new JLabel("File to Test:");
        label.setForeground(lightText);
        //classNameField = new JTextField(30);
        topPanel.add(label);

        classNameField = new JTextField(10);
        classNameField.setBackground(darkBackground);
        classNameField.setForeground(lightText);
        classNameField.setCaretColor(lightText);
        topPanel.add(classNameField);

        // Lab Selector
        labSelector = new JComboBox<>();
        partSelector = new JComboBox<>();

        for (int i = 1; i <= 23; i++) {
            labSelector.addItem("Lab" + i);
        }

        labSelector.addActionListener(e -> updatePartSelector());
        JLabel labLabel = new JLabel("Lab:");
        labLabel.setForeground(lightText);
        labSelector.setBackground(darkBackground);
        labSelector.setForeground(lightText);
        topPanel.add(labLabel);
        topPanel.add(labSelector);

        // Part Selector
        JLabel partLabel = new JLabel("Part:");
        partLabel.setForeground(lightText);
        partSelector.setBackground(darkBackground);
        partSelector.setForeground(lightText);
        topPanel.add(partLabel);
        topPanel.add(partSelector);

        //Browse Button
        JButton browseButton = new JButton("Browse");
        browseButton.setBackground(buttonBackground);
        browseButton.setForeground(lightText);
        browseButton.addActionListener(e -> openFileChooser());
        topPanel.add(browseButton);

        // Run Tests Button
        JButton runButton = new JButton("Run Tests");
        runButton.setBackground(buttonBackground);
        runButton.setForeground(lightText);
        runButton.addActionListener(this::runTests);
        topPanel.add(runButton);

        // Test Results
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setBackground(darkBackground);
        outputArea.setForeground(lightText);
        outputArea.setCaretColor(lightText);
        outputArea.setFont(new Font ("Consolas", Font.PLAIN, 14));
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(outputArea);
        scrollPane.getViewport().setBackground(darkBackground);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        updatePartSelector();
        frame.setVisible(true);
    }

    private void runTests(ActionEvent e) {
        String selectedLab = (String) labSelector.getSelectedItem();
        String selectedPart = (String) partSelector.getSelectedItem();

        if (selectedLab == null || selectedPart == null) {
            outputArea.append("Please select a Lab and a Part to test.\n");
            return;
        }

        // Clear Output Field
        outputArea.setText("");

        // Run the Test Harness
        try {
            String className = classNameField.getText().trim();
            String testPathArg = selectedLab + "." + selectedPart;
            Process process = Runtime.getRuntime().exec(
                    "java -cp out TestHarness " + className + " " + testPathArg
            );
            BufferedReader stdOut = new BufferedReader(new InputStreamReader(process.getInputStream()));
            BufferedReader stdErr = new BufferedReader(new InputStreamReader(process.getErrorStream()));

            String line;
            // NEW
            StringBuilder currentBlock = new StringBuilder();
            int testCount = 0;
            while ((line = stdOut.readLine()) != null) {
                if (line.startsWith("Running program...")) {
                    testCount++;
                    if (currentBlock.length() > 0) {
                        outputArea.append(currentBlock.toString());
                        outputArea.append("\n\n");
                        currentBlock.setLength(0);
                    }
                    currentBlock.append("Test Case ").append(testCount).append(":\n");
                }
                else if (line.startsWith("Expected:")) {
                    currentBlock.append("Expected\n--------\n");
                    currentBlock.append(line.replace(
                            "Expected: ", "")).append("\n");
                }
                else if (line.startsWith("Got:")) {
                    currentBlock.append("\nActual\n--------\n");
                    currentBlock.append(line.replace(
                            "Got: ", "").replace(
                                    "Actual: ", "")).append("\n");
                }
                else if (line.contains("is correct")) {
                    currentBlock.append("✅ Passed!\n");
                }
                else if (line.contains("did not produce")) {
                    currentBlock.append("❌ Failed!\n");
                }
                else {
                    currentBlock.append(line).append("\n");
                }
            }

            if (!currentBlock.isEmpty()) {
                outputArea.append(currentBlock.toString());
            }

            while ((line = stdErr.readLine()) != null) {
                outputArea.append("⚠️ ERROR: " + line + "\n");
            }

            process.waitFor();
        }
        catch (IOException | InterruptedException ex) {
            outputArea.append("Error running tests: " + ex.getMessage());
        }
    }

    private void openFileChooser() {
        UIManager.put("FileChooser.background", new Color(40, 44, 52));
        UIManager.put("FileChooser.foreground", new Color(230, 230, 230));
        UIManager.put("FileChooser.selectionBackground", new Color(60, 63, 65));
        UIManager.put("FileChooser.selectionForeground", new Color(230, 230, 230));
        UIManager.put("FileChooser.textForeground", new Color(230, 230, 230));
        UIManager.put("Panel.background", new Color(40, 44, 52));

        JFileChooser fileChooser = new JFileChooser(lastDirectory);
        fileChooser.setDialogTitle("Select File to Test");

        int result = fileChooser.showOpenDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedPath = fileChooser.getSelectedFile();
            String fullPath = selectedPath.getAbsolutePath();

            // Convert file to a valid class name
            int srcIndex = fullPath.indexOf("src" + File.separator);
            if (srcIndex == -1) {
                JOptionPane.showMessageDialog(frame, "Selected file must be in the src/ directory");
                return;
            }
            String relativePath = fullPath.substring(fullPath.indexOf("src" + File.separator + "main" + File.separator + "java" + File.separator) + 14);
            String className = relativePath.replace(File.separatorChar, '.').replace(".java", "");
            classNameField.setText(className);
        }
    }

    private void updatePartSelector() {
        partSelector.removeAllItems();
        String selectedLab = (String) labSelector.getSelectedItem();
        File labDir = new File("src/main/resources/TestCases/" + selectedLab);

        if (labDir.exists() && labDir.isDirectory()) {
            File[] parts = labDir.listFiles(File::isDirectory);
            if (parts != null) {
                for (File part: parts) {
                    partSelector.addItem(part.getName());
                }
            }
        }
    }
}

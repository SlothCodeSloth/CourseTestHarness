package Lab17;
//2 5 6 5 4 3 23 43 2 0//
import java.util.Scanner;
public class Lab17b {
    public static void main(String[] args) {
        //Declare and assign values to variables//
        Scanner stdin = new Scanner(System.in);
        int[] myNumbers = new int[10];
        System.out.print("Enter the integers between 1 and 100: ");
        for (int i = 0; i < 10; i++) {
            myNumbers[i] = stdin.nextInt();
        }

        //Count the number of occurrences of a value. Print using correct grammar.//
        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = 0; j < myNumbers.length; j++) {
                if (i == myNumbers[j]) {
                    count += 1;
                }
            }

            String output = (count == 1) ? (i + " occurs " + count + " time.\n") :
                            (count > 1)  ? (i + " occurs " + count + " times.\n") :
                            "";
            System.out.print(output);
        }
        stdin.close();
    }
}
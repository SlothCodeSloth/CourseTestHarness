package Lab11;

import java.util.Scanner;
public class Lab11b {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter an SSN: ");
        String ssn = stdin.next();
        int digitCount = 0;

        for (int i = 0; i < ssn.length(); i++) {
            if (Character.isDigit(ssn.charAt(i))) {
                digitCount++;
            }
        }

        if (ssn.length() != 11) {
            System.out.print(ssn + " is an invalid social security number.");
        }
        else if(ssn.charAt(3) != '-' || ssn.charAt(6) != '-') {
            System.out.print(ssn + " is an invalid social security number.");
        }
        else if (digitCount != 9) {
            System.out.print(ssn + " is an invalid social security number.");
        }
        else {
            System.out.print(ssn + " is a valid social security number.");
        }

        stdin.close();
    }
}

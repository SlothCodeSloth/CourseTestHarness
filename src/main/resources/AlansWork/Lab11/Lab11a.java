package Lab11;

import java.util.Scanner;
public class Lab11a {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter the phone number: ");
        String phoneNumber = "1";
        while (phoneNumber.length() != 10) {
            phoneNumber = stdin.next();
            if (phoneNumber.length() != 10) {
                System.out.print("Please enter a valid phone number: ");
            }
        }
        String areaCode = phoneNumber.substring(0, 3);
        String exchangeCode = phoneNumber.substring(3, 6);
        String lineNumber = phoneNumber.substring(6, 10);

        System.out.print("Formatted Phone Number: (" + areaCode + ") " + exchangeCode + "-" + lineNumber);
        stdin.close();
    }
}

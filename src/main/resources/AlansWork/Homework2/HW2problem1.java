package Homework2;

import java.util.Scanner;
public class HW2problem1 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter the user ID: ");
        String id = stdin.next();
        int digitCount = 0;

        for (int i = 0; i < id.length(); i++) {
            if (Character.isDigit(id.charAt(i))) {
                digitCount++;
            }
        }

        String output = (digitCount == 2) ? "The input user ID is valid." :
                                            "The input user ID is invalid.";
        System.out.print(output);

        stdin.close();

    }
}

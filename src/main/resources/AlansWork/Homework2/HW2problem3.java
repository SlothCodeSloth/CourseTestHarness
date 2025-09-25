package Homework2;

import java.util.Scanner;
public class HW2problem3 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String input = stdin.nextLine();

        if (isPalindrome(input)) {
            System.out.print("Input string " + input + " is a palindrome.");
        }
        else {
            System.out.print("Input string " + input + " is not a palindrome.");
        }
        stdin.close();
    }

    public static boolean isPalindrome(String str) {
        String input = str.replace(" ", "").toLowerCase();
        String temp = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            temp += input.charAt(i);
        }
        if (temp.equals(input)) {
            return true;
        }
        else {
            return false;
        }
    }
}


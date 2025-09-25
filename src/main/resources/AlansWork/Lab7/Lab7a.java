package Lab7;

import java.util.Scanner;
public class Lab7a {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int number = stdin.nextInt();
        int temp = number;
        int reverse = 0;
        while (temp != 0) {
            int remainder = temp % 10;
            reverse = (reverse * 10) + remainder;
            temp /= 10;
        }
        if (number == reverse) {
            System.out.print(number + " is a palindrome.");
        }
        else {
            System.out.print(number + " is not a palindrome.");
        }
    }
}


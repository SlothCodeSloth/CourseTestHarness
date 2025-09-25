package Lab14;

import java.util.Scanner;
public class Lab14b {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        reverse(stdin.nextInt());
    }

    public static void reverse (int number) {
        int reverse = 0;
        int temp = number;
        while (temp != 0) {
            int remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }
        System.out.print(reverse);
    }
}

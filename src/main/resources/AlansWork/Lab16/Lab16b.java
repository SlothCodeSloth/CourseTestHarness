package Lab16;

import java.util.Scanner;
public class Lab16b {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = stdin.nextInt();
        }

        System.out.print("Reversed Array is: ");
        for (int k = 9; k >= 0; k--) {
            System.out.print((numbers)[k] + " ");
        }
    }
}

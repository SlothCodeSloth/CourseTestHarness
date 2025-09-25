package Lab23;

import java.util.Scanner;
public class Lab23a {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        System.out.print("Binary representation is: " + dec2Bin(stdin.nextInt()));
        stdin.close();
    }

    public static String dec2Bin(int value) {
        String binary = "";
        if (value == 0) {
            binary = "0";
            return binary;
        }
        while (value != 0) {
            int x = value % 2;
            binary = x + binary;
            value /= 2;
        }
        return binary;
    }
}

package Lab3;

import java.util.Scanner;
public class Lab3a{
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        double balance;
        double rate;
        double intr;

        System.out.print("Enter balance and interest rate: ");
        balance = stdin.nextDouble(); // 1000
        rate = stdin.nextDouble() / 100; // 3.5
        intr = balance * (rate / 12);

        System.out.printf("The interest is %.3f", intr);
        stdin.close();

    }
}

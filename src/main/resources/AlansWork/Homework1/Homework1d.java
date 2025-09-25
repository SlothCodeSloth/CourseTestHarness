package Homework1;

import java.util.Scanner;
public class Homework1d {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter 5 digits: ");
        int numbers = stdin.nextInt();
        int temp = numbers;
        int count = 0;
        while (temp > 0) {
            temp /= 10;
            count++;
        }

        if (count == 5) {
            for (int i = 0; i < 5; i++) {
                int firstDigit = (int) (numbers / Math.pow(10, 4 - i));
                System.out.print(firstDigit + "   ");
                numbers -= Math.pow(10, 4 - i) * firstDigit;
             }
        }
        else {
            System.out.print("Invalid entry. Please input a 5 digit number.");
        }

        stdin.close();
    }
}
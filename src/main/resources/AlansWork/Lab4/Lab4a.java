package Lab4;

import java.util.Scanner;
// 4 DECIMAL

public class Lab4a {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = stdin.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = stdin.nextDouble();

        double bmi = (703 * weight) / Math.pow(height, 2);
        System.out.printf("BMI: %.4f",bmi);

        stdin.close();
    }
}

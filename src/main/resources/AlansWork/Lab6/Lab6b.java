package Lab6;

import java.util.Scanner;
public class Lab6b {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter the weight of your package (in pounds): ");
        double weight = stdin.nextDouble();

        if (weight <= 0) {
            System.out.print("Invalid input");
        }
        else if (weight <= 1) {
            System.out.print("The shipping cost will be $3.50");
        }
        else if (weight <= 3) {
            System.out.print("The shipping cost will be $5.50");
        }
        else if (weight <= 10) {
            System.out.print("The shipping cost will be $8.50");
        }
        else if (weight <= 20) {
            System.out.print("The shipping cost will be $10.50");
        } else {
            System.out.print("The package cannot be shipped.");
        }
        stdin.close();
    }
}

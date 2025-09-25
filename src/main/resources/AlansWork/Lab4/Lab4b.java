package Lab4;

import java.util.Scanner;
public class Lab4b {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double d = stdin.nextDouble();

        System.out.print("Enter the miles per gallon: ");
        double eff = stdin.nextDouble();

        System.out.print("Enter the cost per gallon: ");
        double price = stdin.nextDouble();

        double cost = d * price / eff;
        System.out.printf("The cost of driving is $%.2f", cost);
    }
}

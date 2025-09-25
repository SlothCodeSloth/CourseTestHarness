package Lab5;

import java.util.Scanner;
public class Lab5b {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter the length the side: ");
        double side = stdin.nextDouble();

        if (side <= 0) {
            System.out.print("Invalid side length.");
        }
        else {
            double area = 3 * Math.sqrt(3) * Math.pow(side, 2) / 2;
            System.out.printf("The area of the hexagon is: %.4f", area);
        }
        stdin.close();
    }
}

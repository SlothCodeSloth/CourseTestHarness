package Lab8;

import java.util.Scanner;
public class Lab8a {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        double sides = stdin.nextDouble();
        System.out.print("Enter the side length: ");
        double side = stdin.nextDouble();
        double area = (sides * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / sides));;
        System.out.printf("The area of the polygon is %.3f", area);
        stdin.close();
    }
}


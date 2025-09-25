package Homework5.Problem1;

import java.util.Scanner;
class TestProgram {
    public static void main(String[] args) {
        double side1;
        double side2;
        double side3;
        String color;
        boolean isFilled;
        Scanner stdin =new Scanner(System.in);
        System.out.println("Enter the sides of the triangle: ");
        side1 = stdin.nextDouble();
        side2 = stdin.nextDouble();
        side3 = stdin.nextDouble();

        System.out.println("Enter the color of the triangle: ");
        color = stdin.next();

        System.out.println("Is the triangle filled? ");
        isFilled = stdin.nextBoolean();

        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1)
        {
            System.out.println("Enter valid sides for the triangle.");
            System.exit(0);
        }
        else {
            Triangle triangleOne =new Triangle(side1, side2, side3);
            triangleOne.setColor(color);
            triangleOne.setFilled(isFilled);
            System.out.println("Area of the Triangle: " + triangleOne.getArea());
            System.out.println("Perimeter of the Triangle: " + triangleOne.getPerimeter());
            System.out.println("Color of the Triangle: " + triangleOne.getColor());
            System.out.println("Is the Triangle filled: " + triangleOne.isFilled());
        }

    }

}
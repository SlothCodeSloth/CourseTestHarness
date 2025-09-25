package Lab15;

import java.util.Scanner;
public class Lab15a {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        boolean check = false;
        double side = 0;
        while (!check) {
            System.out.print("Enter the side: ");
            try {
                side = stdin.nextDouble();
                check = true;
            } catch (Exception e) {
                System.out.println("Invalid Input. Try Again");
                stdin.nextLine();
            }
        }

        System.out.printf("The area of the pentagon is %.3f", area(side));
    }

    public static double area (double s) {
        double area = 5 * Math.pow(s, 2) / (4 * Math.tan(Math.PI / 5));
        return area;
    }
}

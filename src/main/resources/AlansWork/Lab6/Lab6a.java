package Lab6;

import java.util.Scanner;
public class Lab6a {
    public static void main(String[] args) {
         Scanner stdin = new Scanner(System.in);
         System.out.print("Enter a, b, and c: ");
         double a = stdin.nextDouble();
         double b = stdin.nextDouble();
         double c = stdin.nextDouble();
         double r1, r2;

         double d = Math.pow(b,2) - 4 * a * c;
         if (d > 0) {
             r1 = (-b + Math.sqrt(d)) / (2 * a);
             r2 = (-b - Math.sqrt(d)) / (2 * a);
             System.out.printf("The equation has two roots: %.3f and %.3f", r1, r2);
         }
         else if (d == 0) {
             r1 = -b / (2 * a);
             System.out.printf("The equation has one root: %.3f", r1);
         }
         else {
             System.out.print("The equation has no real roots.");
         }
         stdin.close();
    }
}

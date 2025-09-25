package Lab3;

import java.util.Scanner;
public class Lab3b {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        double x1, x2, y1, y2, d;

        System.out.print("Enter x1 and y1: ");
        x1 = stdin.nextDouble(); // 1.5
        y1 = stdin.nextDouble(); // -3.4

        System.out.print("Enter x2 and y2: ");
        x2 = stdin.nextDouble(); // 4
        y2 = stdin.nextDouble(); // 5

        d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("The distance between the two points is: %.3f", d);
        stdin.close();

    }
}


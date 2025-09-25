package Lab1;

import java.util.Scanner;
public class lab1d {
    public static void main(String[] args) {

        double v0, v1, t, a;
        Scanner stdin = new Scanner(System.in);
        System.out.print("Please input initial velocity, final velocity, and time: ");
        v0 = stdin.nextDouble();
        v1 = stdin.nextDouble();
        t = stdin.nextDouble();
        a = (v1 - v0) / t;
        System.out.printf("The average acceleration is: %.3f", a);
    }
}

package Lab2;

import java.util.Scanner;
public class Lab2b {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        double m;
        double initial;
        double fin;
        double q;
        System.out.print("Enter the amount of water in kilograms: "); //55.5
        m = stdin.nextDouble();
        System.out.print("Enter the initial temperature: "); //3.5
        initial = stdin.nextDouble();
        System.out.print("Enter the final temperature: "); //10.5
        fin = stdin.nextDouble();
        q = m * (fin - initial) * 4184;
        System.out.printf("The energy needed is: %.3f", q);
        stdin.close();
    }
}

package Lab2;

import java.util.Scanner;
public class Lab2a {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        double c;
        double f;
        System.out.print("Enter a degree in Celsius: "); //43.5
        c = stdin.nextDouble();
        f = (9.0 / 5.0) * c + 32;
        System.out.printf(c + " Celsius is %.3f fahrenheit.", f);
        stdin.close();
    }
}

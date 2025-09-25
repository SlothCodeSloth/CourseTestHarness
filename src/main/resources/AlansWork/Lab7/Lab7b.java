package Lab7;

import java.util.Scanner;
public class Lab7b {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        int x = stdin.nextInt();
        int y = stdin.nextInt();

        boolean inRadius = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) <= 10;
        if (inRadius) {
            System.out.print("Point (" + x + ", " + y + ") is in the circle.");
        }
        else {
            System.out.print("Point (" + x + ", " + y + ") is not in the circle.");
        }
    }
}

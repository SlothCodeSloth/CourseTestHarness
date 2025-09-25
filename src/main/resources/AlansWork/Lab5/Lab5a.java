package Lab5;

import java.util.Scanner;
public class Lab5a {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        double ta = -59;
        double v = 0;
        double wci = 0;

        //Set the outside temperature. Call for a reenter if invalid.
        while (ta < -58 || ta > 41) {
            System.out.print("Enter the temperature in Fahrenheit between -58 Fahrenheit and 41 Fahrenheit: ");
            ta = stdin.nextDouble();
            if (ta < -58 || ta > 41) {
                System.out.print("INVALID ENTRY\n");
            }
        }

        //Set the wind chill. Call for a reenter if invalid.
        while (v < 2) {
            System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
            v = stdin.nextDouble();
            if (v < 2) {
                System.out.print("INVALID ENTRY\n");
            }
        }

        wci = 35.74 + (.6215 * ta) - (35.75 * Math.pow(v, .16)) + (.4275 * ta * Math.pow(v, .16));
        System.out.printf("The wind chill index is %.4f.", wci);
        stdin.close();
    }
}

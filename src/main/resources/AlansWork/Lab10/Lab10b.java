package Lab10;

import java.util.Scanner;
public class Lab10b {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String temp;

        System.out.print("Enter the first city: ");
        String city1 = stdin.nextLine();
        //Chicago
        System.out.print("Enter the second city: ");
        String city2 = stdin.nextLine();
        //Los Angeles
        System.out.print("Enter the third city: ");
        String city3 = stdin.nextLine();
        //Atlanta
        if (city1.compareTo(city2) > 0) {
            temp = city2;
            city2 = city1;
            city1 = temp;
        }

        if (city2.compareTo(city3) > 0) {
            temp = city3;
            city3 = city2;
            city2 = temp;
        }

        if (city1.compareTo(city2) > 0) {
            temp = city2;
            city2 = city1;
            city1 = temp;
        }

        System.out.print("The three cities in alphabetical order are: " + city1 + ", " + city2 + ", and " + city3 + ".");
        stdin.close();
    }
}

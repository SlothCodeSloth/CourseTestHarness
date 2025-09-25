package Homework1;

import java.util.Scanner;
public class Homework1c {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter distance: ");
        int distance = stdin.nextInt();
        int cost = 0;

        for (int i = 1; i <= distance; i++) {
            if (i <= 50) {
                cost += 3;
            }
            else if (i <= 100) {
                cost += 2;
            }
            else if (i > 100) {
                cost += 1;
            }
        }
        System.out.print("Total Cost: " + cost);
        stdin.close();
    }
}

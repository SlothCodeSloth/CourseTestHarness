package Homework1;

import java.util.Scanner;
public class Homework1a {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Side1: ");
        int s1 = stdin.nextInt();
        System.out.print("Side2: ");
        int s2 = stdin.nextInt();
        System.out.print("Side3: ");
        int s3 = stdin.nextInt();

        if (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1) {
            if (s1 == s2 && s1 == s3) {
                System.out.print("Equilateral.");
            }
            else if ((s1 == s2) || (s1 == s3) || (s2 == s3)) {
                System.out.print("Isosceles.");
            }
            else {
                System.out.print("Scalene.");
            }
        }
        else {
            System.out.print("Invalid input!");
        }
        stdin.close();

    }
}

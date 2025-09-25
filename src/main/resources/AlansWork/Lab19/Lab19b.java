package Lab19;

import java.util.Scanner;
public class Lab19b {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        double matrix[][] = new double[4][4];

        System.out.println("Enter a 4-by-4 matrix row by row:");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                matrix[row][col] = stdin.nextDouble();
            }
        }

        System.out.print("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));
    }
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (row == col) {
                    sum += m[row][col];
                }
            }
        }
        return sum;
    }
}

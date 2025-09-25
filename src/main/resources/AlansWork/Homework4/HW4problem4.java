package Homework4;

import java.util.Scanner;
public class HW4problem4 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        double[][] matrix = new double[3][3];
        System.out.println("Enter a 3x3 matrix row by row:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0 ; j < 3; j++) {
                matrix[i][j] = stdin.nextDouble();
            }
        }

        System.out.println("\nThe sorted array is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sortRows(matrix)[i][j] + " ");
            }
            System.out.print("\n");
        }

    }

    public static double[][] sortRows(double[][] m) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = j + 1; k < 3; k++) {
                    double temp = 0;
                    if (m[i][j] > m[i][k]) {
                        temp = m[i][j];
                        m[i][j] = m[i][k];
                        m[i][k] = temp;
                    }
                }
            }
        }
        return m;
    }
}

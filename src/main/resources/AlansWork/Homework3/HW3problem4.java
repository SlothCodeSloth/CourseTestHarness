package Homework3;

import java.util.Scanner;
public class HW3problem4 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter the rows and columns in matrix1: ");
        int row1 = stdin.nextInt();
        int col1 = stdin.nextInt();
        System.out.print("Enter the rows and columns in matrix2: ");
        int row2 = stdin.nextInt();
        int col2 = stdin.nextInt();

        if (col1 != row2) {
            System.out.print("The two matrices cannot be multiplied.");
        }
        else {
            double matrix1[][] = new double[row1][col1];
            double matrix2[][] = new double[row2][col2];

            System.out.print("Enter matrix1: ");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    matrix1[i][j] = stdin.nextDouble();
                }
            }

            System.out.print("Enter matrix2: ");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < col2; j++) {
                    matrix2[i][j] = stdin.nextDouble();
                }
            }

            System.out.print("Multipulcation of the matrices is: ");
            for (int i = 0; i < matrix1.length; i++) {
                System.out.print("\n");
                for (int j = 0; j < matrix2[0].length; j++) {
                    System.out.print(multiplyMatrix(matrix1, matrix2)[i][j] + " ");
                }
            }
        }
    }

    public static double[][] multiplyMatrix(double[][] a, double[][]b){
        double product[][] = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                double sum = 0;
                for (int k = 0; k < b.length; k++) {
                    sum += a[i][k] * b[k][j];
                }
                product[i][j] = (double)Math.round(sum * 10d) / 10d;
            }
        }
        return product;
    }
}
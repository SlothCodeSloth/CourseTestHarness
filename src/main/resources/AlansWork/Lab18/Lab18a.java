package Lab18;

import java.util.Scanner;
public class Lab18a {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter the rows and columns in matrix1: ");
        double matrix[][] = new double[stdin.nextInt()][stdin.nextInt()];
        int row = 0;
        int col = 0;
        double max = 0;

        System.out.println("Enter the array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = stdin.nextDouble();
                if (Math.max(max, matrix[i][j]) == matrix[i][j]) {
                    max = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.print("The location of the largest element is (" + row + ", " + col + ")");
    }
}
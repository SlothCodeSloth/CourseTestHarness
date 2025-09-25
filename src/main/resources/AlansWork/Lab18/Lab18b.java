package Lab18;

import java.util.Scanner;
public class Lab18b {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        double[][] matrix = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                matrix[row][column] = stdin.nextDouble();
            }
        }
        if (isMarkovMatrix(matrix) == true) {
            System.out.print("It is a Markov Matrix.");
        }
        else {
            System.out.print("It is not a Markov Matrix.");
        }
        stdin.close();
    }

    public static boolean isMarkovMatrix(double[][] m) {
        int count = 0;
        double sum = 0;
        boolean result = false;
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                if (m[row][column] < 0) {
                    return result;
                }
            }
        }
        for (int column = 0; column < 3; column++) {
            for (int row = 0; row < 3; row++) {
                sum += m[row][column];
            }
            if (sum == 1) {
                count += 1;
            }
            sum = 0;
        }

        if (count == 3) {
            result = true;
        }

        return result;
    }
}

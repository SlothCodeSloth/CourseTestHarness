package Lab22;

import java.util.Scanner;
public class Lab22a {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("How many elements are in your data set? ");
        int[][] data = new int[stdin.nextInt()][2];

        System.out.println("Enter your array:");
        for (int i = 0; i < data.length; i++) {
            data[i][0] = stdin.nextInt();
            data[i][1] = stdin.nextInt();
        }
        stdin.close();

        sort(data);
        System.out.print("The sorted array is: {");
        for (int i = 0; i < data.length; i++) {
            if (i == data.length - 1) {
                System.out.print("(" + data[i][0] + ", " + data[i][1] + ")");
                break;
            }
            System.out.print("(" + data[i][0] + ", " + data[i][1] + ")");
            System.out.print(", ");
        }
        System.out.print("}");
    }

    public static void sort(int[][] m) {
        for (int i = 0; i < m.length - 1; i++) {
            int minRow = m[i][0];
            int minCol = m[i][1];
            int minIndex = i;
            for (int j = i + 1; j < m.length; j++) {
                if (minRow > m[j][0]) {
                    minRow = m[j][0];
                    minCol = m[j][1];
                    minIndex = j;
                }
                else if (minRow == m[j][0] & minCol > m[j][1]) {
                    minCol = m[j][1];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                m[minIndex][0] = m[i][0];
                m[i][0] = minRow;
                m[minIndex][1] = m[i][1];
                m[i][1] = minCol;
            }
        }
    }
}

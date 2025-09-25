package Homework3;

import java.util.Scanner;
public class HW3problem1 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 9; i++) {
            numbers[i] = stdin.nextInt();
        }

        int[] noDuplicate = eliminateDuplicate(numbers);
        System.out.print("The distinct integers are: ");
        for (int i = 0; i < noDuplicate.length - 1; i++) {
            if (noDuplicate[i] != noDuplicate[i + 1])
            System.out.print(noDuplicate[i] + " ");
        }
        if (noDuplicate[noDuplicate.length - 1] != noDuplicate[noDuplicate.length - 2]) {
            System.out.print(noDuplicate[noDuplicate.length - 1]);
        }
    }

    public static int[] eliminateDuplicate(int[] list) {
        int index = 0;
        int[] distinctArray = new int[10];
        for (int i = 0; i < list.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < index; j++) {
                if (list[i] == distinctArray[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (duplicate == false) {
                distinctArray[index++] = list[i];
            }
        }
        return distinctArray;
    }
}

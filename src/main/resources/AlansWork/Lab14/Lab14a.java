package Lab14;

import java.util.Scanner;
public class Lab14a {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        displayPattern(stdin.nextInt());
        stdin.close();
    }

    public static void displayPattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}

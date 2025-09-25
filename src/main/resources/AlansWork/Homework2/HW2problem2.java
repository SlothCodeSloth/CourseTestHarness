package Homework2;

import java.util.Scanner;
public class HW2problem2 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = stdin.next();
        int check = 2;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != '0' && word.charAt(i) != '1') {
                check = 1;
            }
        }

        for (int i = 0; i < word.length() - 2; i++) {
            if (word.substring(i, i + 3).equals("111")) {
                check = 0;
            }
        }

        switch (check) {
            case 0:
                System.out.print("The binary word is accepted.");
                break;
            case 1:
                System.out.print("The input word is not a valid binary number.");
                break;
            default:
                System.out.print("The binary word is rejected.");
                break;
        }
        stdin.close();
    }
}

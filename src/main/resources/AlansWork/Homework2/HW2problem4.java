package Homework2;

import java.util.Scanner;
public class HW2problem4 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter the first string. ");
        String word1 = stdin.nextLine();
        System.out.println("Enter the second string. ");
        String word2 = stdin.nextLine();
        if (isAnagram(word1, word2)) {
            System.out.print(word1 + " and " + word2 + " are anagrams.");
        }
        else {
            System.out.print(word1 + " and " + word2 + " are not anagrams.");
        }
    }

    public static boolean isAnagram (String first, String second) {
        first = first.toLowerCase().replaceAll(" ", "");
        second = second.toLowerCase().replaceAll(" ", "");

        if (first.length() != second.length()) {
            return false;
        }
        else {
            for (int i = 0; i < first.length(); i++) {
                for (int j = 0; j < second.length(); j++) {
                    if (first.charAt(i) == second.charAt(j)) {
                        second = second.substring(0, j) + second.substring(j + 1);
                        break;
                    }
                }
            }
            if (second.length() == 0) {
                return true;
            }
            else {
                return false;
            }
        }
    }

}
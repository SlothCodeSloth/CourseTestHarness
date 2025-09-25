package Homework1;

import java.util.Scanner;
public class Homework1b_alt {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String input = stdin.nextLine().toLowerCase();
        char letter = input.charAt(0);

        if (Character.isLetter(letter)) {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.print(input + " is a vowel.");
            }
            else {
                System.out.print(input + " is a consonant");
            }
        }

        else {
            System.out.print(input + " is an invalid input");
        }
        stdin.close();

    }
}
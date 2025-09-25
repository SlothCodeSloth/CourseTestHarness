package Homework1;

import java.util.Locale;
import java.util.Scanner;
public class Homework1b {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String input = stdin.nextLine().toLowerCase(Locale.ROOT);

        switch (input) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.print(input + " is a vowel.");
                break;
            case "b":
            case "c":
            case "d":
            case "f":
            case "g":
            case "h":
            case "j":
            case "k":
            case "l":
            case "m":
            case "n":
            case "p":
            case "q":
            case "r":
            case "s":
            case "t":
            case "v":
            case "w":
            case "x":
            case "y":
            case "z":
                System.out.print(input + " is a consonant.");
                break;
            default:
                System.out.print(input + " is an invalid input.");
                break;
            }
        stdin.close();
    }
}

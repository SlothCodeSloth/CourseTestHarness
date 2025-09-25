package Homework5.Problem3;

import java.util.ArrayList;
import java.util.Scanner;
public class CharArray {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String string = stdin.nextLine();
        ArrayList<Character> list = toCharacterArray(string);
        System.out.print("Elements of the Character Array list: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        stdin.close();
    }


    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> list = new ArrayList<Character>();
        for (char a:s.toCharArray()) {
            list.add(a);
        }
        return list;
    }
}

package Homework3;

import java.util.Scanner;
public class HW3problem3 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter 10 strings: ");
        String list = stdin.nextLine();
        String strings[] = list.split(",");
        System.out.print("Sorted strings: ");
        for (int i = 0; i < 10; i++) {
            if (i == 9) {
                System.out.print(sort(strings)[i]);
            }
            else {
                System.out.print(sort(strings)[i] + ", ");
            }
        }
        stdin.close();
    }

    public static String[] sort(String[] str) {
        String temp;
        for (int i = 0; i < str.length; i++) {
            if (str[i].substring(0, 1).compareTo(" ") == 0) {
                str[i] = str[i].substring(1);
            }
        }
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[j].compareTo(str[i]) < 0) {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        return str;
    }
}
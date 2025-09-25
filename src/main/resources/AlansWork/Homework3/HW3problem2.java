package Homework3;

import java.util.Scanner;
public class HW3problem2 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter list1 size and contents: ");
        int[] list1 = new int[stdin.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = stdin.nextInt();
        }

        System.out.print("Enter list2 size and contents: ");
        int[] list2 = new int[stdin.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = stdin.nextInt();
        }

        System.out.print("List 1 is ");
        for (int i = 0; i < list1.length; i++) {
            System.out.print(sort(list1)[i] + " ");
        }

        System.out.print("\nList 2 is ");
        for (int i = 0; i < list2.length; i++) {
            System.out.print(sort(list2)[i] + " ");
        }

        System.out.print("\nMerged list is ");
        for (int i = 0; i < list1.length + list2.length; i++) {
            System.out.print(merge(list1, list2)[i] + " ");
        }

    }

    public static int[] sort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        return list;
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] merged = new int[list1.length + list2.length];

        for (int i = 0; i < list1.length; i++) {
            merged[i] = list1[i];
        }

        for (int i = 0; i < list2.length; i++) {
            merged[list1.length + i] = list2[i];
        }
        return sort(merged);
    }
}
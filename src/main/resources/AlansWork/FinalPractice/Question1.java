package FinalPractice;

import java.util.ArrayList;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.print("Example 1 or 2? ");
        if (stdin.nextInt() == 1) {
            list.remove(1);
            System.out.println(list);
        }
        else {
            list.remove(new Integer(3));
            System.out.println(list);
        }

    }
}

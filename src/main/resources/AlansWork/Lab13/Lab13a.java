package Lab13;

import java.util.Scanner;
public class Lab13a {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Please enter a string and a character: ");

        String input = stdin.nextLine();
        char specified = stdin.next().charAt(0);
        System.out.print(specified + " appears in the string \"" + input + "\" " + count(input, specified) + " times.");
        stdin.close();
    }


    public static int count (String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (a == str.charAt(i)) {
                count ++;
            }
        }
        return count;
    }

}

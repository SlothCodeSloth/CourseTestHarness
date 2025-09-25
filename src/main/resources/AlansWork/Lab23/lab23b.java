package Lab23;

import java.util.Scanner;
public class lab23b {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        System.out.print("Decimal form is: " + bin2Dec(stdin.nextLine()));
        stdin.close();
    }

    public static int bin2Dec(String binaryString) {
        int number = 0;
        char[] bits = binaryString.toCharArray();
        if (binaryString.equals("0")) {
            return 0;
        }
        for (int i = bits.length - 1; i >= 0; i--) {
            if (bits[i] == '1') {
                number += Math.pow(2, bits.length - i - 1);
            }
        }
        return number;
    }
}


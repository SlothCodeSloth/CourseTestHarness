package Lab22;

import java.util.Scanner;
public class Lab22b {
    public static class myInteger {
        private int value;

        public myInteger(int val) {
            value = val;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int val) {
            value = val;
        }

        public boolean isEven() {
            return (value % 2 == 0);
        }

        public boolean isOdd() {
            return (value % 2 != 0);
        }

        public boolean isPrime() {
            for (int i = 2; i <= (value - 1); i++) {
                if (value % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean isEven(myInteger integer) {
            return integer.isEven();
        }

        public static boolean isOdd(myInteger integer) {
            return integer.isOdd();
        }

        public static boolean isPrime(myInteger integer) {
            return integer.isPrime();
        }

        public boolean equals(int val) {
            return (value == val);
        }

        public boolean equals(myInteger integer) {
            return (value == integer.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter your integers: ");
        myInteger int1 = new myInteger(stdin.nextInt());
        myInteger int2 = new myInteger(stdin.nextInt());
        myInteger int3 = new myInteger(stdin.nextInt());
        stdin.close();

        System.out.printf("%d: [even: %5s] [odd: %5s] [prime: %5s]%n", int1.getValue(), int1.isEven(), int1.isOdd(), int1.isPrime());
        System.out.printf("%d: [even: %5s] [odd: %5s] [prime: %5s]%n", int2.getValue(), int2.isEven(), int2.isOdd(), int2.isPrime());
        System.out.printf("%d: [even: %5s] [odd: %5s] [prime: %5s]%n", int3.getValue(), int3.isEven(), int3.isOdd(), int3.isPrime());

        //System.out.println(int1.getValue() + ": " + "[even: " + int1.isEven() + "] [odd: " + int1.isOdd() + "] [prime: " + int1.isPrime() + "]");
        //System.out.println(int2.getValue() + ": " + "[even: " + int2.isEven() + "] [odd: " + int2.isOdd() + "] [prime: " + int2.isPrime() + "]");
        //System.out.println(int3.getValue() + ": " + "[even: " + int3.isEven() + "] [odd: " + int3.isOdd() + "] [prime: " + int3.isPrime() + "]");
        System.out.println("Is " + int1.getValue() + " equal to " + int2.getValue() + "? " + int1.equals(int2));
    }

}

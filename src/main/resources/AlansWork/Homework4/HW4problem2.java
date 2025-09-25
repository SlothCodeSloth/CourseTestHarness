package Homework4;

import java.util.Scanner;
public class HW4problem2 {
    public static class Rational {
        private int numerator;
        private int denominator;

        public Rational(int num, int den) {
            numerator = num;
            denominator = den;
            for (int i = 2; (i < num) || (i < den); i++) {
                if (num % i == 0 & den % i == 0) {
                    numerator /= i;
                    denominator /= i;
                    i = 2;
                }
            }
        }

        public int getNumerator() {
            return numerator;
        }

        public int getDenominator() {
            return denominator;
        }

        public void setNumerator(int num) {
            numerator = num;
        }

        public void setDenominator(int den) {
            denominator = den;
        }

        public Rational add(Rational number) {
            int num = numerator * number.getDenominator() + number.getNumerator() * denominator;
            int den = denominator * number.denominator;
            for (int i = 2; (i < num) || (i < den); i++) {
                if (num % i == 0 & den % i == 0) {
                    num = num / i;
                    den = den / i;
                    i = 2;
                }
            }
            return new Rational(num, den);
        }

        public Rational subtract(Rational number) {
            int num = numerator * number.getDenominator() - number.getNumerator() * denominator;
            int den = denominator * number.denominator;
            for (int i = 2; (i < num) || (i < den); i++) {
                if (num % i == 0 & den % i == 0) {
                    num = num / i;
                    den = den / i;
                    i = 2;
                }
            }
            return new Rational(num, den);
        }

        public Rational multiply(Rational number) {
            int num = numerator * number.getNumerator();
            int den = denominator * number.getDenominator();
            for (int i = 2; (i < num) || (i < den); i++) {
                if (num % i == 0 & den % i == 0) {
                    num = num / i;
                    den = den / i;
                    i = 2;
                }
            }
            return new Rational(num, den);
        }

        public Rational divide(Rational number) {
            int num = numerator * number.getDenominator();
            int den = denominator * number.getNumerator();
            for (int i = 2; (i < num) || (i < den); i++) {
                if (num % i == 0 & den % i == 0) {
                    num = num / i;
                    den = den / i;
                    i = 2;
                }
            }
            return new Rational(num, den);
        }

        public String stringRep() {
            return numerator + " / " + denominator;
        }
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int num;

        System.out.print("Enter the numerator for the first rational number: ");
        num = stdin.nextInt();
        System.out.print("Enter a non-zero denominator for the first rational number: ");
        Rational number1 = new Rational(num, stdin.nextInt());

        System.out.print("Enter the numerator for the second rational number: ");
        num = stdin.nextInt();
        System.out.print("Enter a non-zero denominator for the second rational number: ");
        Rational number2 = new Rational(num, stdin.nextInt());

        System.out.println("First rational number is " + number1.stringRep());
        System.out.println("Second rational number is " + number2.stringRep());

        System.out.println("Addition of the rational numbers is " + number1.add(number2).stringRep());
        System.out.println("Subtraction of the rational numbers is " + number1.subtract(number2).stringRep());
        System.out.println("Multiplication of the rational numbers is " + number1.multiply(number2).stringRep());
        System.out.println("Division of the rational numbers is " + number1.divide(number2).stringRep());
    }
}

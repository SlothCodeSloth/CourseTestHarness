package Homework4;

import java.util.Scanner;
public class HW4problem1 {
    public static class Complex {
        private double real;
        private double imaginary;

        public Complex(double r, double i) {
            real = r;
            imaginary = i;
        }

        public double getReal() {
            return real;
        }

        public double getImaginary() {
            return imaginary;
        }

        public String complexForm(Complex c) {
            return "(" + c.getReal() + ", " + c.getImaginary() + ")";
        }

        public String add(Complex Complex2) {
            return "(" + (real + Complex2.getReal()) + ", " + (imaginary + Complex2.getImaginary()) + ")";
        }

        public String subtract(Complex Complex2) {
            return "(" + (real - Complex2.getReal()) + ", " + (imaginary - Complex2.getImaginary()) + ")";
        }
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        double real;
        double imaginary;

        System.out.print("Enter real part of the first complex number: ");
        real = stdin.nextDouble();
        System.out.print("Enter imaginary part of the first complex number: ");
        imaginary = stdin.nextDouble();
        Complex Complex1 = new Complex(real, imaginary);

        System.out.print("Enter real part of the second complex number: ");
        real = stdin.nextDouble();
        System.out.print("Enter imaginary part of the second complex number: ");
        imaginary = stdin.nextDouble();
        Complex Complex2 = new Complex(real, imaginary);

        System.out.println("First complex number is " + Complex1.complexForm(Complex1));
        System.out.println("Second complex number is " + Complex2.complexForm(Complex2));
        System.out.println("Addition of the complex numbers is " + Complex1.add(Complex2));
        System.out.println("Subtraction of the complex numbers is " + Complex1.subtract(Complex2));
    }
}

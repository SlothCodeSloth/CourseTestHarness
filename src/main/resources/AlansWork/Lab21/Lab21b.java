package Lab21;

import java.util.Scanner;
public class Lab21b {
    public static class LinearEquation {
        private double a;
        private double b;
        private double c;
        private double d;
        private double e;
        private double f;

        public LinearEquation(double A, double B, double C, double D, double E, double F) {
            a = A;
            b = B;
            c = C;
            d = D;
            e = E;
            f = F;
        }

        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }

        public double getD() {
            return d;
        }

        public double getE() {
            return e;
        }

        public double getF() {
            return f;
        }

        public double getX() {
            return (((e * d) - (b * f)) / ((a * d) - (b * c)));
        }

        public double getY() {
            return (((a * f) - (e * c)) / ((a * d) - (b * c)));
        }

        public void setA(double A) {
            a = A;
        }

        public void setB(double B) {
            b = B;
        }

        public void setC(double C) {
            c = C;
        }

        public void setD(double D) {
            d = D;
        }

        public void setE(double E) {
            e = E;
        }

        public void setF(double F) {
            f = F;
        }

        public boolean isSolvable() {
            return ((a * d) - (b * c) != 0);
        }
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, and f: ");
        LinearEquation equation = new LinearEquation(stdin.nextDouble(), stdin.nextDouble(), stdin.nextDouble(), stdin.nextDouble(), stdin.nextDouble(), stdin.nextDouble());
        if (equation.isSolvable()) {
            System.out.print("X is " + equation.getX() + " and Y is " + equation.getY());
        }
        else {
            System.out.print("The equation has no solutions.");
        }
        stdin.close();
    }
}

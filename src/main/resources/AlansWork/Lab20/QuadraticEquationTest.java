package Lab20;
// Quadratic Equation Test
import java.util.Scanner;
public class QuadraticEquationTest {
    public static class QuadraticEquation {
        public static double a;
        public static double b;
        public static double c;

        public QuadraticEquation(double coeffA, double coeffB, double coeffC) {
            a = coeffA;
            b = coeffB;
            c = coeffC;
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

        public double getDiscriminant() {
            return Math.pow(b,2) - 4 * a * c;
        }

        public double getRoot1() {
            if (getDiscriminant() < 0) {
                return 0;
            }
            else {
                return ((-b + Math.sqrt(getDiscriminant())) / (2 * a));
            }
        }

        public double getRoot2() {
            if (getDiscriminant() < 0) {
                return 0;
            }
            else {
                return ((-b - Math.sqrt(getDiscriminant())) / (2 * a));
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter your coefficients: ");
        double a = stdin.nextDouble();
        double b = stdin.nextDouble();
        double c = stdin.nextDouble();
        stdin.close();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        if (equation.getDiscriminant() < 0) {
            System.out.print("The equation has no real roots.");
            java.lang.System.exit(0);
        }

        else if (equation.getDiscriminant() == 0) {
            System.out.printf("The equation has one root: %.3f", equation.getRoot1());
        }

        else if (equation.getDiscriminant() > 0) {
            System.out.printf("The equation has two roots: %.3f and %.3f", equation.getRoot1(), equation.getRoot2());
        }
    }
}

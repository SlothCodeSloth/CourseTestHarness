package Lab16;

import java.util.Scanner;
public class Lab16a {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = stdin.nextDouble();
        }
        System.out.println("The mean is " + mean(numbers));
        System.out.print("The standard deviation is " + deviation(numbers));
    }

    public static double deviation (double[] x) {
        double mean = mean(x);
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += Math.pow(x[i] - mean, 2.0);
        }
        return Math.sqrt(sum / (x.length - 1.0));
    }

    public static double mean (double[] x) {
        double sum = 0.0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum / x.length;
    }

}

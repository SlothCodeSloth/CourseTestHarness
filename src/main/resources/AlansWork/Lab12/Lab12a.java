package Lab12;

public class Lab12a {
    public static void main(String[] args) {
        double sum = 0;

        for (double i = 1.0; i <= 97.0; i += 2) {
            sum += (i / (i + 2.0));
        }

        System.out.printf("%.3f", sum);
    }
}

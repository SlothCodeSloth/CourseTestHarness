package Lab13;

public class Lab13b {
    public static void main(String[] args) {
        System.out.print("i \tm(i)");
        double sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += (((double) i) / (double) (i + 1));
            System.out.print("\n" + i + "\t");
            System.out.printf("%.4f", sum);
        }
    }
}
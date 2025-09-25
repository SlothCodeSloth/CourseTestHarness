package Lab10;

public class Lab10a {
    public static void main(String[] args) {
        int sum = 0;
        int number;

        for (int i = 0; i < 10; i++) {
            number = (int) (Math.random() * 100);
            System.out.print(number + " ");
            sum += number;
        }

        System.out.print("\n" + sum / 10.0);
    }
}

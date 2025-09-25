package Lab12;

public class Lab12b {
    public static void main(String[] args) {
        int sum = 0;
        System.out.print("Perfect Numbers below 10,0000 are: ");

        for (int i = 1; i <= 10000; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
            sum = 0;
        }

    }

}

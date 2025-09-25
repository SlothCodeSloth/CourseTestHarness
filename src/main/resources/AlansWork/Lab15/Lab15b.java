package Lab15;

public class Lab15b {
    public static void main(String[] args) {
        for (int i = 2; i <= 998; i++) {
            if (prime(i) & (prime(i + 2))) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }

    }

    public static boolean prime(int x) {
        for (int i = 2; i <= (x - 1); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;

    }
}

package Lab9;

// Print a string of 3 Uppercase letters and 4 Numbers
public class Lab9b {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print((char) (((int) (Math.random() * 26)) + 65));
        }

        for (int i = 0; i < 4; i++) {
            System.out.print((int) (Math.random() * 9));
        }
    }
}

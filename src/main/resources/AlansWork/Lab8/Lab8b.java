package Lab8;

// Print random lowercase character
public class Lab8b {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 26);
        System.out.print((char) (random +97));
    }
}

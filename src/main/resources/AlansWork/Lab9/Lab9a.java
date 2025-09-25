package Lab9;

// Print random uppercase character.
public class Lab9a {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 26);
        System.out.print((char) (random + 65));
    }
}

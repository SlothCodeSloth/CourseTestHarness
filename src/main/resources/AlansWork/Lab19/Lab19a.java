package Lab19;

public class Lab19a {
    public static void main(String[] args) {
        int[] count = new int[10];
        int[] random = new int[100];
        for (int i = 0; i < 100; i++) {
            random[i] = (int)(Math.random() * 10);
        }
        for (int i : random) {
            System.out.print(i + " ");
            count[i]++;
        }
        System.out.print("\n");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " occurs " + count[i] + " times.");
        }
    }
}

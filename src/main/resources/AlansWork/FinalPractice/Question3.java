package FinalPractice;

public class Question3 {
    public int p;
    public Question3() {
        this(0); // This goes first.
        System.out.println("C's no-arg constructor invoked");
    }

    public Question3(int p) {
        p = p;
    }

    public void setP(int p) {
        p = p;
    }

    public static void main(String[] args) {
        Question3 p = new Question3();
    }
}

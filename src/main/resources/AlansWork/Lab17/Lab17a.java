package Lab17;
//4 - 40 55 70 58//
import java.util.Scanner;
public class Lab17a {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int[] scores = new int[stdin.nextInt()];

        System.out.print("Enter " + scores.length + " scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = stdin.nextInt();
        }

        int best = 0;
        for (int i = 0; i < scores.length - 1; i++) {
            if (best < scores[i]) {
                best = scores[i];
            }
        }

        for (int i = 0; i < scores.length; i++) {
            String grade = scores[i] >= best - 10 ? "A" :
                    scores[i] >= best - 20 ? "B" :
                    scores[i] >= best - 30 ? "C" :
                    scores[i] >= best - 40 ? "D" :
                            "F";
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }
    }
}

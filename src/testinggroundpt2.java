import java.util.Scanner;

public class testinggroundpt2 {
    public static void main(String[] args) {
        Scanner Grades = new Scanner(System.in);
        System.out.print(" What is your Grade? Enter your score 0-100 ");
        int score = Grades.nextInt();

        if (score >= 90) {
            System.out.println("you Aced it Congratz");
        } else if (score >= 80) {
            System.out.println("You got a B");
        } else if (score >= 70) {
            System.out.println("You got a c");
        } else if (score >= 60) {
            System.out.println("You got a d");
        } else {
            System.out.println("You got a f");
        }

    }
}
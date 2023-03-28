import java.util.Scanner;

public class testingGrounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = sc.nextInt();
        if (score >= 90) {
            System.out.println("You got an A!");
        } else if (score >= 80) {
            System.out.println("You got a B!");
        } else if (score >= 70) {
            System.out.println("You got a C!");
        } else if (score >= 60) {
            System.out.println("You got a D.");
        } else System.out.println("You got an F.");
    }
}

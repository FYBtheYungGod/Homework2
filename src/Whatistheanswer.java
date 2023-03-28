import java.util.Scanner;
public class Whatistheanswer {
    public static void main( String [] args) {
        System.out.println("What is the Capital of France? ");
        System.out.println("A: Georgia ");
        System.out.println("B: Florida ");
        System.out.println("C: Paris ");
        System.out.print("Type your answer: ");
        Scanner Answer = new Scanner(System.in);
        String Useranswer = Answer.nextLine();
        switch (Useranswer) {
            case "A":
            case "a":
                System.out.println(" incorrect ur trash");
                break;
            case "B":
            case "b":
                System.out.println(" incorrect ur trash");
                break;
            case "C":
            case "c":
                System.out.println(" Correct Ur amazing");
                break;
            default:
                System.out.println("Invalid answer. Please enter A B or C. ");




        }

    }
    }


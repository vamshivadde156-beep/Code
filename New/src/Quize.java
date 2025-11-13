import java.util.Scanner;
public class Quize {



        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int score = 0;

            System.out.println("let start!");

            // Question 1
            System.out.println("Question 1: What is the capital of India?");
            System.out.println("1. Delhi");
            System.out.println("2. Berlin");
            System.out.println("3. Paris");
            System.out.println("4. Rome");
            System.out.print("Enter your answer (1-4): ");
            int ans1 = input.nextInt();

            switch (ans1) {
                case 1:
                    System.out.println("Correct!");
                    score++;
                    break;
                default:
                    System.out.println("Incorrect. The answer is Paris.");
            }


            System.out.println("Question 2: What is the capital of Karnataka?");
            System.out.println("1. Delhi");
            System.out.println("2. Hydrabad");
            System.out.println("3. Bangaluru");
            System.out.println("4. Jaipur");
            System.out.print("Enter your answer (1-4): ");
            int ans2 = input.nextInt();

            switch (ans2) {
                case 3:
                    System.out.println("Correct!");
                    score++;
                    break;
                default:
                    System.out.println("Incorrect. The answer is Mars.");
            }
            System.out.println("Quiz completed! Your score is: " + score + " out of 2.");
        }

}

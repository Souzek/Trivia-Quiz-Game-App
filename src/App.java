import java.util.Scanner;
/**
 * Mini Quiz Game
 * This program simulates a simple quiz game where users answer multiple-choice questions.
 * It keeps track of the score and provides feedback based on the user's performance.
 */
public class App {
    public static void main(String[] args) throws Exception {
        int userAnswer;
        int score = 0;
        int totalQuestions = 5;
         int[] answers = {1, 2, 3, 2, 1}; // Correct answers for the questions
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Mini Quiz Game!");
        System.out.println("You will be asked " + totalQuestions + " questions. Try to answer them correctly!");
        // Questions and options
        String[] questions = {
            "What is the capital of France?",
            "What is 2 + 2?",
            "What is the largest planet in our solar system?",
            "What is the boiling point of water in Celsius?",
            "Who wrote 'To Kill a Mockingbird'?",
        };
        String[][] options = {
           {"1. Paris", "2. London", "3. Berlin", "4. Madrid"}, 
            {"1. 3", "2. 4", "3. 5", "4. 6"},
            {"1. Earth", "2. Mars", "3. Jupiter", "4. Saturn"},
            {"1. 90", "2. 100", "3. 80", "4. 120"},
            {"1. Harper Lee", "2. Mark Twain", "3. F. Scott Fitzgerald", "4. Ernest Hemingway"},
        };
        // Loop through each question
        for (int i = 0; i < totalQuestions; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Your answer (1-4): ");
                userAnswer = scanner.nextInt();
            // Check if the answer is correct
            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect");
            }
        }
        // Display the final score
        System.out.println("\nQuiz Over! Your final score is: " + score + " out of " + totalQuestions);
        // Provide feedback based on the score
        if (score == totalQuestions) {
            System.out.println("Excellent! You answered all questions correctly!");
        } else if (score >= totalQuestions / 2) {
            System.out.println("Good job! You answered more than half of the questions correctly.");
        } else {
            System.out.println("Keep trying! You can do better next time.");
        }
        // Close the scanner
        scanner.close();
       
    }
}

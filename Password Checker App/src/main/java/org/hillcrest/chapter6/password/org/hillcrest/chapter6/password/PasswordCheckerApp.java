package org.hillcrest.chapter6.password;

import java.util.Scanner;

public class PasswordCheckerApp {

    // The UML and the Flow chart:

    /**
     *This is where the user puts in the password
     * @param args the arguments
     */
    public static void main(String[] args) {
         Scanner in  = new Scanner(System.in);

        System.out.println("Please enter a new password: ");
        String password = in.nextLine();

        int score = CriteriaChecker.evaluateCriteria(password);
        String strength = CriteriaChecker.determinesScore(score);
        String feedback = FeedbackGenerator.generateFeedback(password);

        System.out.println("Your password score is: " + score);

        if(!feedback.isEmpty()){
            System.out.println("Some suggestions to improve your password are: " + feedback);
        }
    }
}

package org.hillcrest.chapter6.password;

import javax.swing.*;

public class FeedbackGenerator {
    //utility class for generating feedback based on password

    /**
     * This class gives feedback based on the password and what to improve
     * @param password the password that is being checked
     * @return the feedback to make the password better
     */
    public static String  generateFeedback(String password) {

        String feedback = "";
        boolean thereIsUppercase = false;
        boolean thereIsLowercase = false;
        boolean thereIsDigits = false;
        boolean thereIsSpecial = false;

        String specialCharacters = "!@#$%^&*()_+";

        // this is loop in which the password is checked and feedback is given based upon that
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                thereIsUppercase = true;
            }
            else if (Character.isLowerCase(ch)) {
                thereIsLowercase = true;
            }
            else if (Character.isDigit(ch)) {
                thereIsDigits = true;
            }
            else if (specialCharacters.indexOf(ch) != 1) {
                thereIsSpecial = true;
            }
        }


        // This gives verbal feedback on what to improve
        if(password.length() < 8) {
            feedback += "Password is short and it has to be at least 8 characters long.\n";
        } else if (!thereIsUppercase) {
            feedback += "There is no uppercase character. Add an uppercase letter. \n";
        } else if (!thereIsLowercase) {
            feedback += "There is no lowercase character. Add an lower case letter.\n";
        }else if (!thereIsDigits) {
            feedback += "There are no digits in the password. Add a digit.\n";
        }else if (!thereIsSpecial) {
            feedback = "Add a special character because there is not a single special character";
        }
        return feedback;
    }

}

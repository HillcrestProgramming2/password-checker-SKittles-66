package org.hillcrest.chapter6.password;

public class CriteriaChecker {
    //utility class

    /**
     *  This class checks whether the password meets the conditions to be a good password
     * @param password the password that needs to be evaluated
     * @return number of criteria met by the user input
     */
    public static int evaluateCriteria(String password){
        int score = 0;

        boolean thereIsUppercase = false;
        boolean thereIsLowercase = false;
        boolean thereIsDigits = false;
        boolean thereIsSpecial = false;

        String specialCharacters = "!@#$%^&*()_+";

        // This is a loop that goes over the password word by word and looks if it meets the requirement
        for (int i = 0; i < password.length(); i++) {
            char k = password.charAt(i);

            if (Character.isUpperCase(k)) {
                thereIsUppercase = true;
            }
            else if (Character.isLowerCase(k)) {
                thereIsLowercase = true;
            }
            else if (Character.isDigit(k)) {
                thereIsDigits = true;
            }
            else if (specialCharacters.indexOf(k) != -1) {
                thereIsSpecial = true;

            }

        }
        if (password.length() >= 8) {
            score++;
        }
        if(thereIsUppercase) {
            score++;
        }
        if(thereIsLowercase) {
            score++;
        }
        if(thereIsDigits) {
            score++;
        }
        if(thereIsSpecial) {
            score++;
        }

        return score;
    }

    // This gives back a score based on how many requirements are met
    public static String determinesScore(int score){
        if (score <= 2){
            return "Weak";
        }
        else if (score == 3){
            return "Moderate";
        }
        else{
            return "Strong";
        }
    }
}

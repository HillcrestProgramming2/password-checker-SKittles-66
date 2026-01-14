package org.hillcrest.chapter6.password;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FeedbackGeneratorTest {

    @Test
    void testFeedbackMissingCriteria() {
        String feedback = FeedbackGenerator.generateFeedback("k");
        assertTrue(feedback.contains("Password is short and it has to be at least 8 characters long."));
        assertTrue(feedback.contains("There is no uppercase character. Add an uppercase letter."));
        assertTrue(feedback.contains("There is no lowercase character. Add an lower case letter."));
        assertTrue(feedback.contains("Add a special character because there is not a single special character"));
        assertTrue(feedback.contains("There are no digits in the password. Add a digit."));
    }

    @Test
    void testNoFeedbackForStrongPassword() {
        String feedback = FeedbackGenerator.generateFeedback("Secure@2024");
        assertEquals("", feedback);
    }
}

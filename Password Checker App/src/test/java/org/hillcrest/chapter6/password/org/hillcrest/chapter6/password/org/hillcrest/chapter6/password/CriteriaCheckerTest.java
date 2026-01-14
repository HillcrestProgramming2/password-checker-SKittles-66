package org.hillcrest.chapter6.password;

import org.hillcrest.chapter6.password.CriteriaChecker;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CriteriaCheckerTest {

    @Test
    public void testWeakPassword(){
        assertEquals(1, CriteriaChecker.evaluateCriteria("12345"));
        assertEquals("Weak", CriteriaChecker.determinesScore(1));
    }
    @Test
    public void testModeratePassword() {
        assertEquals(3, CriteriaChecker.evaluateCriteria("password123"));
        assertEquals("Moderate", CriteriaChecker.determinesScore(3));
    }
    @Test
    public void testStrongPassword() {
        assertEquals(5, CriteriaChecker.evaluateCriteria("Secure@2024"));
        assertEquals("Strong", CriteriaChecker.determinesScore(5));
    }

}


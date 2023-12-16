package co.in.excercise;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PalindromeCheckerTest {
	PalindromeChecker checker = null;
	@BeforeEach
	void setUp() {
		 checker = new PalindromeChecker();
	}

	@AfterEach
	void tearDown() {
		checker = null;
	}
	
	@Test
    void testNullTest() {
		assertFalse(checker.isPalindrome(null));
    }
	@Test
    void testEmptyString() {
		assertFalse(checker.isPalindrome(""));
    }



	@Test
    void testSingleLetter() {
        assertTrue(checker.isPalindrome("A"));
        assertTrue(checker.isPalindrome("a"));
    }

    @Test
    void testName() {
        assertTrue(checker.isPalindrome("ABBA"));
        assertFalse(checker.isPalindrome("Ava"));
        assertTrue(checker.isPalindrome("bob"));
        assertFalse(checker.isPalindrome("FAIL"));
        assertFalse(checker.isPalindrome("Fail"));
        assertFalse(checker.isPalindrome("fail"));
    }

    @Test
    void testWord() {
        assertTrue(checker.isPalindrome("madam"));
        assertFalse(checker.isPalindrome("Racecar"));
        assertTrue(checker.isPalindrome("RADAR"));
        assertFalse(checker.isPalindrome("FAIL"));
        assertFalse(checker.isPalindrome("Fail"));
        assertFalse(checker.isPalindrome("fail"));
    }
}

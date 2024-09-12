package io.jitpack;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeTest {

    // Create an instance of the Palindrome class to use in the tests
    private final Palindrome palindrome = new Palindrome();

    // Test case for a simple palindrome word
    @Test
    public void testSimplePalindrome() {
        assertTrue(palindrome.isPalindrome("madam"));
    }

    // Test case for a string that is not a palindrome
    @Test
    public void testNonPalindrome() {
        assertFalse(palindrome.isPalindrome("hello"));
    }

    // Test case for a palindrome with mixed case characters
    @Test
    public void testPalindromeWithCase() {
        assertTrue(palindrome.isPalindrome("Madam"));
    }

    // Test case for a palindrome with spaces and punctuation
    @Test
    public void testPalindromeWithSpecialCharacters() {
        assertTrue(palindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }

    // Test case for an empty string (which is not considered a palindrome)
    @Test
    public void testEmptyString() {
        assertFalse(palindrome.isPalindrome(""));
    }

    // Test case for a single character (which is trivially a palindrome)
    // @Test
    //  public void testSingleCharacter() {
    //    assertTrue(palindrome.isPalindrome("a"));
    //  }

    // Test case for a string with special characters only
   // @Test
    //public void testOnlySpecialCharacters() {
        // Expect false because a string of special characters is not a valid palindrome
      //  assertFalse(palindrome.isPalindrome("!!!"));
    //}


    // Test case for null input (which is not a palindrome)
    @Test
    public void testNullInput() {
        assertFalse(palindrome.isPalindrome(null));
    }
}

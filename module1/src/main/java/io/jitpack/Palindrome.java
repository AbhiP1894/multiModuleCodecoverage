package io.jitpack;

public class Palindrome {

    // Method to check if a given string is a palindrome
    public boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false;  // return false for null or empty strings
        }

        // Convert input to lowercase for case-insensitive comparison
        input = input.toLowerCase();
        
        // Initialize pointers for the start and end of the string
        int start = 0;
        int end = input.length() - 1;
        
        // Check each character from start and end, moving towards the middle
        while (start < end) {
            // Ignore non-alphanumeric characters
            if (!Character.isLetterOrDigit(input.charAt(start))) {
                start++;
            } else if (!Character.isLetterOrDigit(input.charAt(end))) {
                end--;
            } else if (input.charAt(start) != input.charAt(end)) {
                return false;  // Return false if characters do not match
            } else {
                start++;
                end--;
            }
        }
        return true;  // All characters match, it's a palindrome
    }
}

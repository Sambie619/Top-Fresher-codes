package strings;

public class PalindromeChecker {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println("Is palindrome: " + isPalindrome(s));
    }

    // TIME: O(n), SPACE: O(1)
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        
        // Compare characters from both ends
        while (i < j) {
            // If mismatch found, not palindrome
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}


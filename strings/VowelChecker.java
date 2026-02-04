package strings;

public class VowelChecker {
    public static void main(String[] args) {
        char ch = 'A';
        if (isVowel(ch)) {
            System.out.println(ch + " is VOWEL");
        } else if (Character.isLetter(ch)) {
            System.out.println(ch + " is CONSONANT");
        } else {
            System.out.println(ch + " is not alphabet");
        }
    }

    // TIME: O(1), SPACE: O(1)
    public static boolean isVowel(char ch) {
        // Convert to lowercase for easy checking
        ch = Character.toLowerCase(ch);
        
        // Check if it's one of 5 vowels
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}


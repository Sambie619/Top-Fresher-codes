package strings;

public class VowelCounter {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println("Vowels count: " + countVowels(s));
    }

    // TIME: O(n), SPACE: O(1)
    public static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            // Check each character if vowel (ignore case)
            if (isVowel(s.charAt(i))) count++;
        }
        return count;
    }
    
    // Helper method (reuse from VowelChecker)
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}


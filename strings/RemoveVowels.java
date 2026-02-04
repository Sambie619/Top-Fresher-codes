package strings;

public class RemoveVowels {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println("No vowels: " + removeVowels(s));
    }

    // TIME: O(n), SPACE: O(n)
    public static String removeVowels(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // Append only if NOT vowel
            if (!isVowel(ch)) {
                result.append(ch);
            }
        }
        return result.toString();
    }
    
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}


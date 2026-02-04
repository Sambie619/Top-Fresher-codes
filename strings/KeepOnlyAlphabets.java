package strings;

public class KeepOnlyAlphabets {
    public static void main(String[] args) {
        String s = "Hello123World!@#";
        System.out.println("Only alphabets: " + keepOnlyAlphabets(s));
    }

    // TIME: O(n), SPACE: O(n)
    public static String keepOnlyAlphabets(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // Keep only letters (A-Z, a-z)
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}


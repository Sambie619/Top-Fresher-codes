package strings;

public class ToggleCase {
    public static void main(String[] args) {
        String s = "HeLLo";
        System.out.println("Toggled: " + toggleCase(s));
    }

    // TIME: O(n), SPACE: O(n)
    public static String toggleCase(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // Lower to upper, upper to lower, others unchanged
            if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}


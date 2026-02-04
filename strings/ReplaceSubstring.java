package strings;

public class ReplaceSubstring {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(replaceSubstring(s, "World", "Java"));
    }

    // TIME: O(n * m), SPACE: O(n)
    public static String replaceSubstring(String s, String oldSub, String newSub) {
        // EDGE CASES
        if (s == null || oldSub == null || newSub == null) return s;
        if (oldSub.isEmpty()) return s; // Essential to prevent infinite loop
        
        StringBuilder result = new StringBuilder();
        int i = 0;
        int n = s.length();
        int m = oldSub.length();
        
        while (i <= n - m) {
            // Check if substring matches
            // Note: substring() and equals() both take O(m) time
            if (s.substring(i, i + m).equals(oldSub)) {
                result.append(newSub);
                i += m;  // Skip matched part
            } else {
                result.append(s.charAt(i));
                i++;
            }
        }
        // Add remaining characters
        while (i < n) {
            result.append(s.charAt(i++));
        }
        return result.toString();
    }
}
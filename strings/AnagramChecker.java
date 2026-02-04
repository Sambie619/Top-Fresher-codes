package strings;

public class AnagramChecker {
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";
        System.out.println("Anagrams: " + areAnagrams(s1, s2));
    }

    // TIME: O(n), SPACE: O(1)
    public static boolean areAnagrams(String s1, String s2) {
        // EDGE CASE 1: Null check
        if (s1 == null || s2 == null) return false;

        // EDGE CASE 2: Handle spaces and case sensitivity
        // We replace all whitespace and convert to lowercase
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // Quick length check (now that strings are cleaned)
        if (s1.length() != s2.length()) return false;
        
        // EDGE CASE 3: Empty strings are technically anagrams
        if (s1.isEmpty() && s2.isEmpty()) return true;

        int[] count = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        
        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }
}

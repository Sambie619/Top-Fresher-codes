package strings;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "swiss";
        System.out.println("First non-repeating: " + firstNonRepeatingChar(s));
    }

    // TIME: O(n), SPACE: O(1) - fixed 256 size array
    public static char firstNonRepeatingChar(String s) {
        // EDGE CASES: Handle null or empty input strings
        if (s == null || s.length() == 0) {
            return '\0';
        }

        int[] count = new int[256];
        
        // First pass: count frequencies
        for (int i = 0; i < s.length(); i++) {
            count[(int)s.charAt(i)]++;
        }
        
        // Second pass: find first with count == 1
        for (int i = 0; i < s.length(); i++) {
            if (count[(int)s.charAt(i)] == 1) {
                return s.charAt(i);
            }
        }
        return '\0';  // None found
    }
}

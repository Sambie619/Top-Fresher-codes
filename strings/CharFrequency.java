package strings;

public class CharFrequency {
    public static void main(String[] args) {
        String s = "Hello!";
        int[] freq = charFrequency(s);
        
        // Fix: Printing the array directly gives a memory address.
        // We need to loop through and print only characters that appear.
        System.out.println("Character Frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println("'" + (char) i + "': " + freq[i]);
            }
        }
    }

    /**
     * TIME: O(n) where n is string length
     * SPACE: O(1) because the array size (256) is constant regardless of input size
     */
    public static int[] charFrequency(String s) {
        if (s == null) return new int[0];
        
        // Standard Extended ASCII range
        int[] freq = new int[256]; 

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Safety check for non-ASCII characters
            if (c < 256) {
                freq[c]++;
            } else {
                System.err.println("Warning: Character '" + c + "' is outside ASCII range.");
            }
        }
        return freq;
    }
}


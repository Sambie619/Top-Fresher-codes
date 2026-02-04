package strings;

public class RemoveSpaces {
    public static void main(String[] args) {
        String s = "Hello   World  ";
        System.out.println("No spaces: " + removeSpaces(s));
    }

    // TIME: O(n), SPACE: O(n)
    public static String removeSpaces(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            // Skip space characters
            if (s.charAt(i) != ' ') {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}


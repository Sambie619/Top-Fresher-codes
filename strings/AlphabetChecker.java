package strings;

public class AlphabetChecker {
    public static void main(String[] args) {
        char ch = 'Z';
        System.out.println(ch + " is " + (isAlphabet(ch) ? "alphabet" : "not alphabet"));
    }

    // TIME: O(1), SPACE: O(1)
    public static boolean isAlphabet(char ch) {
        // Check uppercase A-Z or lowercase a-z range
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
    }
}


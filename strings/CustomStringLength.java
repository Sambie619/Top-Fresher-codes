package strings;

public class CustomStringLength {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println("Length = " + customLength(s));
    }

    // TIME: O(n), SPACE: O(1)
    public static int customLength(String s) {
        int len = 0;
        // Keep accessing charAt() until IndexOutOfBoundsException
        try {
            while (true) {
                s.charAt(len);  // Throws exception when len == actual length
                len++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception means reached end of string
        }
        return len;
    }
}


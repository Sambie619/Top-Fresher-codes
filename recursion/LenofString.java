package recursion;

public class LenofString {
    // Find length of string using recursion
    // TC: O(n)
    // SC: O(n) recursion stack
    public static int length(String s) {
        // edge case
        if (s == null) return 0;
        if (s.equals("")) return 0;

        // remove first character and count +1
        return 1 + length(s.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(length("hello")); // 5
        System.out.println(length(""));      // 0
        System.out.println(length(null));    // 0
    }
}

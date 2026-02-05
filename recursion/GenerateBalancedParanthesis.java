package recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateBalancedParanthesis {
    // Generate all balanced parentheses of n pairs
    // TC: O(Cn) where Cn is Catalan number (approx 4^n / sqrt(n))
    // SC: O(n) recursion stack (excluding output list)
    public static void generate(int n, int open, int close, StringBuilder sb, List<String> res) {
        // base case: formed 2*n length valid string
        if (sb.length() == 2 * n) {
            res.add(sb.toString());
            return;
        }

        // can add '(' if open < n
        if (open < n) {
            sb.append('(');
            generate(n, open + 1, close, sb, res);
            sb.deleteCharAt(sb.length() - 1); // backtrack
        }

        // can add ')' only if close < open (to keep it valid)
        if (close < open) {
            sb.append(')');
            generate(n, open, close + 1, sb, res);
            sb.deleteCharAt(sb.length() - 1); // backtrack
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();

        // edge case
        if (n < 0) return res;
        if (n == 0) {
            res.add("");
            return res;
        }

        generate(n, 0, 0, new StringBuilder(), res);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
        // Output: [((())), (()()), (())(), ()(()), ()()()]
    }
}

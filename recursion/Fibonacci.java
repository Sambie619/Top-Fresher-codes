package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
    static int fib(int n){
        if(n<=1)return n;
        return fib(n-1)+fib(n-2);
    }
}
/*
import java.util.Arrays;

public class FibonacciMemo {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    static int fib(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return helper(n, dp);
    }

    static int helper(int n, int[] dp) {
        if (n <= 1) return n;

        if (dp[n] != -1) return dp[n];  // already computed

        dp[n] = helper(n - 1, dp) + helper(n - 2, dp);
        return dp[n];
    }
}avoids repeated fibo(n) computation,now o(n),o(n)  before  o(2^n),o(n)
*/

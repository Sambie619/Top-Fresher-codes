package recursion;



public class PowerofNum {

    // Fast Power using recursion (Exponentiation by Squaring)
    // TC: O(log n)
    // SC: O(log n) recursion stack
    public static long power(long a, long n) {
        // edge case
        if (n == 0) return 1;

        long half = power(a, n / 2);

        if (n % 2 == 0) return half * half;
        else return half * half * a;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10)); // 1024
        System.out.println(power(5, 0));  // 1
    }
}
/*
power(2,10)
half = power(2,5)

power(2,5)
half = power(2,2)

power(2,2)
half = power(2,1)

power(2,1)
half = power(2,0)

power(2,0) = 1
*/

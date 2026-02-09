package recursion;

public class checkPrime {
    // Helper function to check prime recursively
    // TC: O(sqrt(n))
    // SC: O(sqrt(n)) recursion stack
    private static boolean isPrimeHelper(int n, int i) {
        // if i*i > n, no divisor found -> prime
        if (i * i > n) return true;

        // if divisible -> not prime
        if (n % i == 0) return false;

        // check next divisor
        return isPrimeHelper(n, i + 1);
    }

    public static boolean isPrime(int n) {
        // edge cases
        if (n <= 1) return false;
        if (n == 2) return true;

        return isPrimeHelper(n, 2);
    }

    public static void main(String[] args) {
        System.out.println(isPrime(29)); // true
        System.out.println(isPrime(15)); // false
        System.out.println(isPrime(1));  // false
    }
}
/* ✅ Trace for isPrime(29)
Start:
isPrimeHelper(29, 2)
Check:
2*2 = 4 <= 29
29 % 2 != 0 → continue
Next:
isPrimeHelper(29, 3)
3*3 = 9 <= 29
29 % 3 != 0 → continue
Next:
isPrimeHelper(29, 4)
4*4 = 16 <= 29
29 % 4 != 0 → continue
Next:
isPrimeHelper(29, 5)
5*5 = 25 <= 29
29 % 5 != 0 → continue
Next:
isPrimeHelper(29, 6)
6*6 = 36 > 29 ✅ stop!
Return true.
So:
isPrime(29) = true*/

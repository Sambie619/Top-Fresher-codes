package numbersnmathlogic;

public class PerfNo {
    public static void main(String[] args) {
        int n = 28;
        if(n == getDivisorsSum(n))
            System.out.println (n + " is a perfect number");
        else
            System.out.println (n + " is not a perfect number");
    }
    static int getDivisorsSum(int n) {
        int sum = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int divisor1 = i;
                int divisor2 = n / i;

                // add divisor1 if it's not the number itself
                if (divisor1 != n)
                    sum += divisor1;

                // add divisor2 if it's different and not the number itself
                if (divisor2 != divisor1 && divisor2 != n)
                    sum += divisor2;
            }
        }
        return sum;
    }

}


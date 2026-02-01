package numbersnmathlogic;

public class Pnumsinarange {
    public static void main(String[] args) {
        int lower = 1, upper = 20;
        for(int i=lower;i<=upper;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

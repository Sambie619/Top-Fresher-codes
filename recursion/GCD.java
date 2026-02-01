package recursion;

public class GCD {
    public static void main(String[] args) {
        System.out.println(hcf(10, 28));
    }
    static int hcf(int a, int b){
        if(b==0)return a;
        return hcf(b,a%b);
    }
}

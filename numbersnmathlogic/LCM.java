package numbersnmathlogic;

public class LCM {
    public static void main(String[] args) {
        int num1 = 36, num2 = 60;
        int hcf = getHCF (num1, num2);
        System.out.println ("The HCF: " + hcf);
        int lcm = (num1 * num2) / hcf;
        System.out.println ("The LCM: " + lcm);
    }
    static int getHCF(int a,int b){
        return b==0?a:getHCF(b, a%b);
    }
}

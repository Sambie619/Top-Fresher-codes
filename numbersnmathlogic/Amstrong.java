package numbersnmathlogic;

public class Amstrong {
    public static void main(String[] args) {
        int num=153,len;
        len=order(num);
        System.out.println(isAmstrong(num, len)?"amstrong!!":"not amstrong!!");

    }
    public static int order(int n){
        int l=0;
        while(n!=0){
            l++;
            n/=10;
        }return l;
    }
    public static boolean  isAmstrong(int n,int l){
        int ams=0;
        int digit,dup=n;
        while(n!=0){
            digit=n%10;
            ams=ams+(int)Math.pow(digit, l);
            n/=10;
        }return ams==dup;
    }
}

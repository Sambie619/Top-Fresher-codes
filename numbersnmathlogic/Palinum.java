package numbersnmathlogic;

public class Palinum {
    public static void main(String[] args) {
        //String name="Malayalam";
       // System.out.println(isPali(name.toLowerCase()));
        //System.out.println(isPali("12345"));
        int num=121;
        int og=num;
        int res=0;
        while(num!=0){
            res=res*10+(num%10);
            num/=10;
        }
        System.out.println(og==res?"pali":"not pali");

    }
    //public static boolean isPali(String str){
        //String rev=new StringBuilder(str).reverse().toString();
       // return  str.equals(rev);
    //}
}

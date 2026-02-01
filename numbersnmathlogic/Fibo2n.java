package numbersnmathlogic;

public class Fibo2n {
    public static void main(String[] args) {
     int num = 5;
     int a = 0, b = 1;
     System.out.print (a + " , " + b + " , ");
     int nextTerm;
    for(int i=2;i<num;i++){
        nextTerm=a+b;
        a=b;
        b=nextTerm;
        System.out.print(nextTerm+" , ");

    }
    }
}

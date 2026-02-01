package numbersnmathlogic;

public class NthFibo {
    public static void main(String[] args) {
        int n=5;
        System.out.println("Nth Fibonacci term: " + getFibonacci(n));
    }
    public static int getFibonacci(int n){
        if(n<0)throw new IllegalArgumentException("n must be non-ve");
        if(n==0)return 0;
        if(n==1)return 1;
        int previous=0;
        int current=1;
        for(int i=2;i<=n;i++){
            int next=previous+current;
            previous=current;
            current=next;
        }return current;
    }
}

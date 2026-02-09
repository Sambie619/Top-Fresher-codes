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
/*🌿 Recursion Chain Diagram
hcf(10,28)
   ↓
hcf(28,10)
   ↓
hcf(10,8)
   ↓
hcf(8,2)
   ↓
hcf(2,0)  -> returns 2    */

    

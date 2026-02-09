package recursion;

public class Revnum {
    public static void main(String[] args) {
        System.out.println(reverse(24, 0));
    }
    static int reverse(int n,int rev){
        if(n==0)return rev;
        return reverse(n/10,rev*10+n%10);
    }
}
/*
📞 Step-by-step Call Trace
1) First call
reverse(24, 0)
n%10 = 4
rev*10 + n%10 = 0*10 + 4 = 4
n/10 = 2
→ reverse(2, 4)
2) Second call
reverse(2, 4)
n%10 = 2
rev*10 + n%10 = 4*10 + 2 = 42
n/10 = 0
→ reverse(0, 42)
3) Base case
reverse(0, 42) = 42
✅ Final Output
42
⏱️ Complexity
Time: O(number of digits)
Space: O(number of digits) (recursion stack)*/

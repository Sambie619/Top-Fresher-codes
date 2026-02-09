package recursion;

public class Largestinarray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 9, 1};
        System.out.println(max(arr, 0));

    }
    static int max(int[] arr, int i) {
        if(i==arr.length-1)return arr[i];
        return Math.max(arr[i],max(arr, i + 1));
    }
}
/*Recursion Tree
max(arr,0)
   |
max(arr,1)
   |
max(arr,2)
   |
max(arr,3)
   |
max(arr,4)   <-- base case
📞 Call Expansion (Going Down)
max(arr,0)
= max(3, max(arr,1))

max(arr,1)
= max(5, max(arr,2))

max(arr,2)
= max(2, max(arr,3))

max(arr,3)
= max(9, max(arr,4))

max(arr,4)
= 1   <-- base case

*/

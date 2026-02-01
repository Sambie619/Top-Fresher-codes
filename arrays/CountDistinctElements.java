package arrays;

import java.util.HashSet;

public class CountDistinctElements {
     // Function to count distinct elements in an array
    public static int countDistinct(int[] arr) {
        // ---------- Edge Cases ----------
        // If array is null or empty, no distinct elements exist
        if (arr == null || arr.length == 0) {
            return 0;
        }
        //to store only unq
        HashSet<Integer>set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        // Size of HashSet equals number of distinct elements
        return set.size();
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40, 50};
        System.out.println(countDistinct(arr)); // Output: 5
    }//t:o(n),s:o(n)
}

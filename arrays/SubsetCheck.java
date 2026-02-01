package arrays;

import java.util.HashSet;

public class SubsetCheck {
    // Function to check if arr2 is a subset of arr1
    public static boolean isSubset(int[] arr1, int[] arr2){
        //edge cases 
        if(arr2==null||arr2.length==0){
            return true;
        }
        if(arr1==null||arr1.length==0){
            return false;
        }
        //Use HashSet for O(1) average lookup time
        HashSet<Integer>set=new HashSet<>();
        for (int num:arr1) {
            set.add(num);
        }
        for(int num:arr2){
            if(!set.contains(num)){
                return false;
            }
        }
        // All elements of arr2 are present in arr1
        return true;
    }
    // ---------- Driver Code ----------
    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7};

        System.out.println(isSubset(arr1, arr2)); // true
}//tc:o(n+m).sc:o(n)
}

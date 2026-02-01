package arrays;

import java.util.HashSet;

public class DisjointArrays {
    // Function to check if two arrays are disjoint
    public static boolean areDisjoint(int[] arr1, int[] arr2) {
        // ---------- Edge Cases ----------
        // If either array is null, treat them as disjoint
        if (arr1 == null || arr2 == null) {
            return true;
        }
        // If either array is empty, they cannot share elements
        if (arr1.length == 0 || arr2.length == 0) {
            return true;
        }
        HashSet<Integer>set=new HashSet<>();
        if(arr1.length<=arr2.length){
            //store small arr eles to optimise space
            for(int num:arr1){
                set.add(num);
            }
            for(int num:arr2){
                if(set.contains(num)){
                    return false;
                }
            }
        }
        else{
            for(int num:arr2){
                set.add(num);
            }
            for(int num:arr1){
                if(set.contains(num)){
                    return false;
                }
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        int[] arr1 = {10, 5, 3, 6};
        int[] arr2 = {8, 7, 9};

        System.out.println(areDisjoint(arr1, arr2)); // true
    }//tc:o(n+m),sc:O(min(n, m))
}

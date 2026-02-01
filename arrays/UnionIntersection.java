package arrays;

import java.util.HashSet;
import java.util.Set;

public class UnionIntersection {

     // Function to find UNION of two arrays
    public static Set<Integer> findUnion(int[] arr1, int[] arr2) {
        // ---------- Edge Cases ----------
        // If both arrays are null or empty, return empty set
        if ((arr1 == null || arr1.length == 0) && 
            (arr2 == null || arr2.length == 0)) {
            return new HashSet<>();
        }
        Set<Integer> unionSet = new HashSet<>();
        if(arr1!=null){
            for(int num:arr1){
                unionSet.add(num);
            }
        }
        if (arr2 != null) {
            for (int num : arr2) {
                unionSet.add(num);
            }
        }

        return unionSet;
    }
    // Function to find INTERSECTION of two arrays
    public static Set<Integer> findIntersection(int[] arr1, int[] arr2) {
        // ---------- Edge Cases ----------
        // If either array is null or empty, intersection is empty
        if (arr1 == null || arr2 == null || 
            arr1.length == 0 || arr2.length == 0) {
            return new HashSet<>();
        }
        // Store elements of first array in a HashSet
        HashSet<Integer>set=new HashSet<>();
        for(int num:arr1){
            set.add(num);
        }
        Set<Integer> intersectionSet = new HashSet<>();

        // Check elements of second array
        for (int num : arr2) {
            // If element exists in set, it is part of intersection
            if (set.contains(num)) {
                intersectionSet.add(num); // Avoid duplicates
            }
        }

        return intersectionSet;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {7, 1, 5, 2, 3, 6};
        int[] arr2 = {3, 8, 6, 20, 7};

        System.out.println("Union: " + findUnion(arr1, arr2));
        System.out.println("Intersection: " + findIntersection(arr1, arr2));
        //tc:o(n+m),,o(n+m),sc:o(n+m)
    }
}

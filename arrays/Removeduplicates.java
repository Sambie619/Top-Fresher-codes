package arrays;

import java.util.HashSet;

public class Removeduplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        // Base case: empty array
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        //HashSet stores only unique elements
        HashSet<Integer>set=new HashSet<>();
        //dups r auto removed 
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        // Print array after removing duplicates
        System.out.println("Array after removing duplicates:");
        for (int x : set) {
            System.out.print(x + " ");
        }
    }
    //Time: O(n),Space: O(n)
}

package arrays;

import java.util.HashMap;
import java.util.Map;

public class SymmetricPairs {
    // Function to find and print all symmetric pairs
    public static void findSymmetricPairs(int[][] pairs) {
        // ---------- Edge Cases ----------
        // If input is null or has less than 2 pairs, symmetric pairs are impossible
        if (pairs == null || pairs.length < 2) {
            return;
        }
        // HashMap to store first -> second mapping
        Map<Integer, Integer> map = new HashMap<>();
        // Traverse all pairs
        for(int[]pair:pairs){
            if(pair==null||pair.length<2){
                continue;
            }
            int first=pair[0];
            int second=pair[1];
            // If reverse pair already exists, we found a symmetric pair
            if(map.containsKey(second)&& map.get(second)==first){
                System.out.println("("+first+","+second+")");
            }
            //other wise store 
            else{
                map.put(first, second);
            }
        }
    }
    public static void main(String[] args) {
         int[][] pairs = {
            {1, 2},
            {3, 4},
            {2, 1},
            {5, 6},
            {4, 3}
        };
        findSymmetricPairs(pairs);
        // Output:
        // (2, 1)
        // (4, 3)
    }//tc:o(n),sc:o(n)
}


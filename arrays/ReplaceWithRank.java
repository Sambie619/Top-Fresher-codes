package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReplaceWithRank {

    // Function to replace each element by its rank
    public static int[] replaceByRank(int[] arr) {

        // ---------- Edge Cases ----------
        // If array is null or empty, return as it is
        if (arr == null || arr.length == 0) {
            return arr;
        }

        int n = arr.length;
        int[]sorted=arr.clone();
        Arrays.sort(sorted);
        // HashMap to store element -> rank mapping
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank=1;
        // Assign ranks in sorted order
        for (int i = 0; i < n; i++) {
            // Assign rank only if element not already ranked
            // This ensures duplicate elements get the same rank
            if(!rankMap.containsKey(sorted[i])){
                rankMap.put(sorted[i], rank);
                rank++;
            }
        }
        // Replace original array elements with their ranks
        for (int i = 0; i < n; i++) {
            arr[i] = rankMap.get(arr[i]);
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {20, 15, 26, 2, 98, 6};

        System.out.println(Arrays.toString(replaceByRank(arr)));
        // Output: [4, 3, 5, 1, 6, 2]
        //tc:o(nlogn),sc:o(n)
    }
}

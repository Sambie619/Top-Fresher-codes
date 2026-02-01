package arrays;

import java.util.HashMap;

public class RepeatingElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5};

        // Base case: empty array
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        // HashMap to store element -> frequency
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Step 1: Count frequency of each element
        for (int i = 0; i < arr.length; i++) {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }

        // Step 2: Print elements with frequency > 1
        System.out.println("Repeating elements:");
        for(int key:freqMap.keySet()){
            if(freqMap.get(key)>1){
                System.out.print(key+" ");
            }
        }
    }//tc:o(n),sc:o(n)
}

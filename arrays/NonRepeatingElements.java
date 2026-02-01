package arrays;

import java.util.HashMap;

public class NonRepeatingElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5};

        // Base case: empty array
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        HashMap<Integer,Integer>freqMap=new HashMap<>();
        //cnt freq of each ele 
        for (int i = 0; i < arr.length; i++) {
            freqMap.put(arr[i],1+freqMap.getOrDefault(arr[i], 0));
        }
        // Step 2: Print elements with frequency = 1
        System.out.println("Non-repeating elements:");
        for (int i = 0; i < arr.length; i++){
            if(freqMap.get(arr[i])==1){
                System.out.print(arr[i]+" ");
            }
        }
    }//tc:o(n),sc:o(n)
}

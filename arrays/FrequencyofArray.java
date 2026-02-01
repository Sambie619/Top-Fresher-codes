package arrays;

import java.util.HashMap;

public class FrequencyofArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5};

        // Base case: empty array
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        HashMap<Integer,Integer>freqmap=new HashMap<>();//to str freqs
        for (int i = 0; i < arr.length; i++) {
            if(freqmap.containsKey(arr[i])){
                freqmap.put(arr[i],freqmap.get(arr[i])+1);
            }
            else{
                freqmap.put(arr[i],1);// If element does not exist, add with count 1
            }
        }
        //t:o(n),s:o(n)
        // Print frequency of each element
        System.out.println("Element : Frequency");
        for (int key : freqmap.keySet()) {
            System.out.println(key + " : " + freqmap.get(key));
        }

    }
}

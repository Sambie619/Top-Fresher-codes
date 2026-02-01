package arrays;

public class MaxProductSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};

        // Base case: empty array
        if (arr.length == 0) {
            System.out.println("No subarray");
            return;
        }

        // maxProd = maximum product ending at current index
        // minProd = minimum product ending at current index
        int maxProd = arr[0];
        int minProd = arr[0];

        // result stores the overall maximum product
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // If current element is negative, swap max and min
            // because multiplying by negative flips signs
            if(arr[i]<0){
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            // Update max and min product at current index
            maxProd=Math.max(maxProd,maxProd*arr[i]);
            minProd=Math.min(minProd,minProd*arr[i]);
            // Update result
            result = Math.max(result, maxProd);
        }
        // Print maximum product subarray
        System.out.println("Maximum product subarray = " + result);
    }//tc:o(n),sc:o(1)
}

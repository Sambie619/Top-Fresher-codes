package arrays;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        // Base case: empty array
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        int currentSum = arr[0]; // sum of current subarray
        int maxSum = arr[0];     // maximum sum found so far
        for (int i = 1; i < arr.length; i++) {
            // Either extend current subarray or start new subarray
            currentSum=Math.max(currentSum+arr[i],arr[i]);
            // Update maximum sum
            maxSum=Math.max(maxSum,currentSum);
        }
        // Print maximum subarray sum
        System.out.println("Maximum subarray sum = " + maxSum);
    }
}

package arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 9};
        // Base case: if array is empty
        if (arr.length == 0) {
            System.out.println("Sum = 0");
            return;
        }
        int sum=0;
        // Traverse array once -> O(n)
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Sum of elements = " + sum);
    }
}

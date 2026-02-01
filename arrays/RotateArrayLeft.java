package arrays;

public class RotateArrayLeft {

    // Function to reverse array from index start to end
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;

        int n = arr.length;

        // Base case: empty array or no rotation needed
        if (n == 0 || k == 0) {
            return;
        }
        //if k gt array length
        k=k%n;
        //1.rev first k eles  ,for ryt its like 3,1,2 steps
        reverse(arr, 0, k-1);
        //rev remainin
        reverse(arr, k, n-1);
        //rev entire 
        reverse(arr, 0, n-1);
        // Print left rotated array
        System.out.println("Left Rotated Array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        //tc:o(n),sc:o(1)
    }
}

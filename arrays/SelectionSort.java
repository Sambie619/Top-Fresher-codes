package arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        // Base case: array with 0 or 1 element is already sorted
        if (arr.length <= 1) {
            return;
        }
        int n = arr.length;
        for (int i = 0; i < n-1 ; i++) {
            int minIndex=i;//assume
            //find indx of minIndex in rem arr
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[minIndex]){
                    minIndex=j;//find the min
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        // Print sorted array
        System.out.println("Sorted array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }//tc:o(n^2),sc:o(1)
}

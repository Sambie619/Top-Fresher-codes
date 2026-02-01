package arrays;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Base case: empty or single element array is always sorted
        if (arr.length <= 1) {
            System.out.println("Array is sorted");
            return;
        }
        //traverse n comp adj eles
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                System.out.println("Array is NOT sorted");
                return;
            }
        }
        // If loop completes, array is sorted
        System.out.println("Array is sorted");
        //tc:o(n),sc:o(1)

    }
}

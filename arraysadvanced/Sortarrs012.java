package arraysadvanced;

public class Sortarrs012 {

    // Function to sort array of 0s, 1s and 2s
    public static void sort012(int[] arr) {

        // Edge case: null or size <= 1
        if (arr == null || arr.length <= 1) {
            return;
        }

        int low = 0;               // position for 0
        int mid = 0;               // current index
        int high = arr.length - 1; // position for 2

        while (mid <= high) {

            if (arr[mid] == 0) {
                // swap arr[mid] and arr[low]
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                low++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else if (arr[mid] == 2) {
                // swap arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
            else {
                throw new IllegalArgumentException(
                    "Array contains elements other than 0, 1, or 2"
                );
            }
        }
    }

    // Print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {2, 0, 2, 1, 1, 0};

        System.out.println("Before sorting:");
        printArray(arr);

        sort012(arr);

        System.out.println("After sorting:");
        printArray(arr);
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)



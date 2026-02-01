package arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // Base case: empty or single element array
        if (arr.length <= 1) {
            System.out.println("Reversed array:");
            for (int x : arr) {
                System.out.print(x + " ");
            }
            return;
        }
        //pointers to start and end indeces
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        // Print reversed array
        System.out.println("Reversed array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

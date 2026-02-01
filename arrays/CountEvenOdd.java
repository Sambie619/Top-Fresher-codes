package arrays;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 6, 7, 8, 10};

        // Base case: empty array
        if (arr.length == 0) {
            System.out.println("Even count = 0");
            System.out.println("Odd count = 0");
            return;
        }
        int evenCount = 0; // to count even numbers
        int oddCount = 0;  // to count odd numbers

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0)evenCount++;
            else oddCount++;
        }
        // Print results
        System.out.println("Even elements count = " + evenCount);
        System.out.println("Odd elements count = " + oddCount);
        //Time: O(n),Space: O(1)
    }
}

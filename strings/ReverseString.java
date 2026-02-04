package strings;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println("Reversed: " + reverseString(s));
    }

    // TIME: O(n), SPACE: O(n) for char array
    public static String reverseString(String s) {
        // Convert to char array for swapping
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        
        // Swap characters from both ends toward center
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}


package strings;

public class StringPermutations {
    public static void main(String[] args) {
        printPermutations("ABC");
    }

    // TIME: O(n * n!), SPACE: O(n) recursion depth
    public static void printPermutations(String s) {
        // EDGE CASES: Handle null or empty input
        if (s == null) {
            return;
        }
        if (s.isEmpty()) {
            System.out.println(""); // Or just return depending on requirement
            return;
        }

        permuteHelper(s.toCharArray(), 0);
    }
    
    private static void permuteHelper(char[] arr, int index) {
        // Base case: printed one full permutation
        if (index == arr.length) {
            System.out.println(new String(arr));
            return;
        }
        
        // Fix current position, permute remaining
        for (int i = index; i < arr.length; i++) {
            // Swap current with i
            swap(arr, index, i);
            // Recurse for next position
            permuteHelper(arr, index + 1);
            // Backtrack - restore original
            swap(arr, index, i);
        }
    }
    
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

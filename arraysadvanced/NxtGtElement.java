package arraysadvanced;

import java.util.*;

public class NxtGtElement {

    // Next Greater Element (to the right)
    // TC: O(n)  -> each element pushed & popped at most once
    // SC: O(n)  -> stack + answer array
    public static int[] nextGreater(int[] arr) {

        // edge case
        if (arr == null || arr.length == 0) return new int[0];

        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>(); // stores elements (not indexes)

        // traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // pop all smaller or equal elements (they can't be NGE)
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            // if stack empty -> no greater element on right
            ans[i] = st.isEmpty() ? -1 : st.peek();

            // push current element for future elements on left
            st.push(arr[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};

        int[] res = nextGreater(arr);

        System.out.println(Arrays.toString(res));
        // Output: [5, 10, 10, -1, -1]
    }
}


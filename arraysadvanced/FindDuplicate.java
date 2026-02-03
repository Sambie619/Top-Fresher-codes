package arraysadvanced;

public class FindDuplicate {

    public static int findDuplicate(int[] nums) {

        // ---------- Edge Case ----------
        if (nums == null || nums.length <= 1) {
            return -1; // no duplicate possible
        }

        // Step 1: Initialize slow and fast pointers
        int slow = nums[0];
        int fast = nums[0];

        // Step 2: Move slow by 1 step, fast by 2 steps
        // They will meet inside the cycle
        do {
            slow = nums[slow];           // move one step
            fast = nums[nums[fast]];     // move two steps
        } while (slow != fast);

        // Step 3: Find entrance to the cycle
        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        // Both pointers meet at duplicate number
        return slow;
    }

    // Testing
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println("Duplicate: " + findDuplicate(arr));
    }//
}
//Floyd’s Cycle Detection (Tortoise & Hare)
//💡 Key Insight    o(n),o(1)
//Think of the array as a linked list:
//Index → Node
//Value at index → Next pointer
//Since one value is repeated → cycle exists
//Finding the start of the cycle = duplicate number

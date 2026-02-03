package arraysadvanced;

// Trapping Rain Water - Two Pointer Approach
// Calculate total water trapped between bars using left/right max heights

public class RainWaterTrapping {

    public static void main(String[] args) {

        int[] height = {4,2,0,3,2,5};
        System.out.println("Trapped Water = " + trap(height));
    }

    public static int trap(int[] height) {

        // EDGE CASE: Need at least 3 bars to trap water
        if (height == null || height.length < 3) return 0;

        // TIME: O(n) single pass, SPACE: O(1) constant variables only
        int left = 0;               // Left pointer starts at beginning
        int right = height.length - 1;  // Right pointer starts at end
        int leftMax = 0;            // Max height seen from left side
        int rightMax = 0;           // Max height seen from right side
        int water = 0;              // Total trapped water

        // Continue until pointers meet
        while (left < right) {

            // Process shorter side first (height[left] < height[right])
            if (height[left] < height[right]) {

                // Update left max height
                leftMax = Math.max(leftMax, height[left]);
                
                // Water trapped = min(leftMax, rightMax) - height[left]
                // But since height[left] < height[right], rightMax >= height[right] > height[left]
                // So water = leftMax - height[left]
                water += leftMax - height[left];
                left++;  // Move left pointer right

            } else {  // height[left] >= height[right]

                // Update right max height
                rightMax = Math.max(rightMax, height[right]);
                
                // Similarly: water = rightMax - height[right]
                water += rightMax - height[right];
                right--;  // Move right pointer left
            }
        }

        return water;
    }
}


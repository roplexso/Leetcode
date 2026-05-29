class Solution {
    public int trap(int[] height) {
        // FIX: Handle edge cases where array is empty or null
        if (height == null || height.length == 0) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int total = 0;
        
        int leftMax = height[0];
        int rightMax = height[right];
        
        while (left < right) {
            if (height[left] < height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                // Simplified: Removed the redundant if-check
                total += leftMax - height[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                // Simplified: Removed the redundant if-check
                total += rightMax - height[right];
                right--;
            }
        }
        return total;
    }
}
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare > rightSquare) {
                result[i] = leftSquare;
                left++; // Move left pointer forward
            } else {
                result[i] = rightSquare;
                right--; // Move right pointer backward
            }
        }
        return result;
    }
}
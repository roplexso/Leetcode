class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int[] count = new int[limit + 1];
        for (int weight : people) {
            count[weight]++;
        }
        
        int boats = 0;
        int left = 1;
        int right = limit;
        
        while (left <= right) {
            while (left <= right && count[left] <= 0) {
                left++;
            }
            while (left <= right && count[right] <= 0) {
                right--;
            }
            if (left > right) {
                break;
            }
            boats++;
            if (left + right <= limit) {
                count[left]--; 
            }
            
            count[right]--;
        }
        
        return boats;
    }
}
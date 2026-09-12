class Solution {
    public int jump(int[] nums) {
        int currentEnd = 0;
        int maxIndex = 0;
        int jumps = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            maxIndex = nums[i] + i > maxIndex ? nums[i] + i : maxIndex;

            if (currentEnd == i) {
                jumps++;
                currentEnd = maxIndex;
            }
        }
        return jumps;
    }
}
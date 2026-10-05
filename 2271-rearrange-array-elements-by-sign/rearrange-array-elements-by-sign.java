class Solution {
    public int[] rearrangeArray(int[] nums) {
        int result[] = new int[nums.length];

        int i = 0;
        int j = 1;
        int index = 0;

        while (index < nums.length) {
            if (nums[index] > 0) {
                result[i] = nums[index];
                i += 2;
            } else {
                result[j] = nums[index];
                j += 2;
            }
            index++;
        }

        return result;
    }
}
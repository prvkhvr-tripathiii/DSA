class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        int p = 0;
        
        for (int q = 0; q < nums.length; q++) {
            if (nums[p] != nums[q]) {
                nums[++p] = nums[q];
            }
        }
        
        return p + 1;
    }
}
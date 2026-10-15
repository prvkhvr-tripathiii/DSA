class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        int odd = 1;
        int n = nums.length;

        while (even < n && odd < n) {
            if (nums[even] % 2 != 0 && nums[odd] % 2 == 0) {
                int temp = nums[odd];
                nums[odd] = nums[even];
                nums[even] = temp;
                odd += 2;
                even += 2;
            } 
            else if (nums[even] % 2 == 0) {
                even += 2;
            } 
            else if (nums[odd] % 2 != 0) {
                odd += 2;
            } 
            else {
                odd += 2;
                even += 2;
            }
        }

        return nums;
    }
}
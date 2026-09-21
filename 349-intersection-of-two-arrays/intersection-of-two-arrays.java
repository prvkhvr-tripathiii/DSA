class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        // Arrays.sort(nums1);
        // Arrays.sort(nums2);

        Set <Integer> set = new HashSet<>();
        Set <Integer> res = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                res.add(nums2[i]);
            }
        }

        int ans[] = new int[res.size()];

        int i = 0;
        for (int num : res) {
            ans[i++] = num;
        }

        return ans;
    }
}
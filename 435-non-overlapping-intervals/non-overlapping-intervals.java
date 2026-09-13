class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        int count = 0;

        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int prevEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int currStart = intervals[i][0];

            if (prevEnd > currStart) {
                count++;
            } else {
                prevEnd = intervals[i][1];
            }
        }
        return count;
    }
}
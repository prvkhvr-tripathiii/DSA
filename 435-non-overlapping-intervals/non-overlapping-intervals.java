class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        List <int[]> rem = new ArrayList<>();
        int n = intervals.length;

        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int prevEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int currStart = intervals[i][0];

            if (prevEnd > currStart) {
                rem.add(intervals[i]);
            } else {
                prevEnd = intervals[i][1];
            }
        }
        return rem.size();
    }
}
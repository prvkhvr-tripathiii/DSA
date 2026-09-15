class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[1], b[1]));
        int arrows = 0;
        int currArr = 0;

        for (int i = 0; i < points.length; i++) {
            currArr = points[i][1];
            while (i < points.length - 1 && currArr >= points[i + 1][0]) {
                i++;
            }
            arrows++;
        }

        return arrows;
    }
}
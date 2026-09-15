class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[1], b[1]));
        int arrows = 0;
        long currArr = Long.MIN_VALUE;

        for (int i = 0; i < points.length; i++) {
            if (currArr < points[i][0]) {
                currArr = points[i][1];
                arrows++;
            }
        }
        return arrows;
    }
}
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        
        int totalUnits = 0;

        for (int i = 0; i < boxTypes.length; i++) {
            if (truckSize >= boxTypes[i][0]) {
                truckSize -= boxTypes[i][0];
                totalUnits += boxTypes[i][0] * boxTypes[i][1];
            }
            else {
                totalUnits += truckSize * boxTypes[i][1];
                truckSize = 0;
            }
        }

        return totalUnits;
    }
}
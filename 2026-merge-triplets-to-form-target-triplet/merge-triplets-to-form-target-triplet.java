class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {

        boolean aFound = false;
        boolean bFound = false;
        boolean cFound = false;

        for (int i = 0; i < triplets.length; i++) {
            if (triplets[i][0] <= target[0]
            && triplets[i][1] <= target[1]
            && triplets[i][2] <= target[2]) {
                if (triplets[i][0] == target[0]){
                    aFound = true;
                }
                if (triplets[i][1] == target[1]){
                    bFound = true;
                }
                if (triplets[i][2] == target[2]){
                    cFound = true;
                }
            }
        }

        if (aFound && bFound && cFound) {
            return true;
        }

        return false;
    }
}
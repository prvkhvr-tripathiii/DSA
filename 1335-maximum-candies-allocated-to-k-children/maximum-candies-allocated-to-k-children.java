class Solution {
    public int maximumCandies(int[] candies, long k) {
        int high = 0;
        long total = 0;

        for (int i = 0; i < candies.length; i++) {
            total += candies[i];
            high = Math.max(high, candies[i]);
        }

        if (total < k) {
            return 0;
        }

        // if (total == k) {
        //     return 1;
        // }

        int low = 1;
        int bestResult = 0;
        
        while (high >= low) {
            int mid = low + (high - low) / 2;
            long maxC = 0;

            for (int i = 0; i < candies.length; i++) {
                maxC += candies[i] / mid;
            }

            if (maxC >= k) {
                bestResult = mid > bestResult ? mid : bestResult;
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        
        return bestResult;
    }
}
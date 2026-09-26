class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap <Integer, Integer> map = new HashMap<>();
        String rank[] = new String[score.length];
        int n = score.length - 1;

        for (int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }

        Arrays.sort(score);
        // rank[map.get(score[n])] = "Gold Medal";
        // rank[map.get(score[n - 1])] = "Silver Medal";
        // rank[map.get(score[n - 2])] = "Bronze Medal";

        for (int i = n; i >= 0; i--) {
            if (i == n) {
                rank[map.get(score[n])] = "Gold Medal";
            }
            else if (i == n - 1) {
                rank[map.get(score[n - 1])] = "Silver Medal";
            }
            else if (i == n - 2) {
                rank[map.get(score[n - 2])] = "Bronze Medal";
            } 
            else {
                rank[map.get(score[i])] = String.valueOf(n - i + 1);
            }
        }

        // for (int i = 0; i < score.length; i++) {
        //     int highest = Collections.max(map.keySet());
        //     rank[map.remove(highest)] = String.valueOf(i + 1);
        // }

        // for (int i = 0; i < rank.length; i++) {
        //     if ("1".equals(rank[i])) {
        //         rank[i] = "Gold Medal";
        //     }
        //     if ("2".equals(rank[i])) {
        //         rank[i] = "Silver Medal";
        //     }
        //     if ("3".equals(rank[i])) {
        //         rank[i] = "Bronze Medal";
        //     }
        // }
        return rank;
    }
}
class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap <Integer, Integer> map = new HashMap<>();
        String rank[] = new String[score.length];

        for (int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }

        for (int i = 0; i < score.length; i++) {
            int highest = Collections.max(map.keySet());
            rank[map.remove(highest)] = String.valueOf(i + 1);
        }

        for (int i = 0; i < rank.length; i++) {
            if ("1".equals(rank[i])) {
                rank[i] = "Gold Medal";
            }
            if ("2".equals(rank[i])) {
                rank[i] = "Silver Medal";
            }
            if ("3".equals(rank[i])) {
                rank[i] = "Bronze Medal";
            }
        }
        return rank;
    }
}
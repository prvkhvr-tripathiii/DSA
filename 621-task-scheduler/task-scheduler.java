class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[] = new int[26];

        for (char task : tasks) {
            freq[task - 'A']++;
        }

        Arrays.sort(freq);

        int maxCount = freq[25];

        int gaps = maxCount - 1;
        int idleSpots = gaps * n;

        for (int i = 24; i >= 0; i--) {
            idleSpots -= Math.min(freq[i], gaps);
        }

        if (idleSpots > 0) {
            return tasks.length + idleSpots;
        }
        return tasks.length;
    }
}
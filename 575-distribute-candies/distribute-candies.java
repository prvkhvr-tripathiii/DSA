class Solution {
    public int distributeCandies(int[] candyType) {

        Arrays.sort(candyType);
        int candy = candyType[0];
        int count = 1;
        int n = candyType.length;

        for (int i = 1; i < n; i++) {
            if (candy != candyType[i]) {
                candy = candyType[i];
                count++;
            }
        }

        return n/2 < count ? n/2 : count;
    }
}
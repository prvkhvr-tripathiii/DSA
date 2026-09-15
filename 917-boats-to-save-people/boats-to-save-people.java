class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort (people);
        int boats = 0;
        int lightest = 0;
        int heaviest = people.length - 1;

        while (lightest <= heaviest) { 
            if (people[lightest] + people[heaviest] <= limit) {
                boats++;
                lightest++;
                heaviest--;
            } else {
                heaviest--;
                boats++;
            }
        }
        return boats;
    }
}
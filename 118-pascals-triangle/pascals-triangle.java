class Solution {
    public List<List<Integer>> generate(int numRows) {
        List <List <Integer>> ans = new ArrayList<>();
        
        for (int row = 1; row <= numRows; row++) { 
            List <Integer> list = new ArrayList<>();

            int val = 1;
            list.add(val);

            for (int j = 1; j < row; j++) {
                val *= row - j;
                val /= j;
                list.add(val);
            }
            ans.add(list);

        }
        return ans;
    }
}
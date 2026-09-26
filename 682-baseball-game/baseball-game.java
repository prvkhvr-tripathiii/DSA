class Solution {
    public int calPoints(String[] operations) {
        int i = 0; 
        int j = 0;
        int n = operations.length;
        int record[] = new int[n];

        while (i < n) {
            if ("+".equals(operations[i])) {
                record[j] = record[j-1] + record[j-2];
                j++;
            }
            else if ("D".equals(operations[i])) {
                record[j] = record[j-1] * 2;
                j++;
            }
            else if ("C".equals(operations[i])) {
                record[--j] = 0;
            }
            else {
                record[j] = Integer.parseInt(operations[i]);
                j++;
            }
            i++;
        }

        int sum = 0;
        for (int r : record) {
            sum += r;
        }

        return sum;
    }
}
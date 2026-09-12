class Solution {
    public List<Integer> partitionLabels(String s) {
        List <Integer> list = new ArrayList<>();
        HashMap <Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put (s.charAt(i), i);
        }

        int end = 0;
        int size = 0;

        for (int i = 0; i < s.length(); i++) {

            size++;
            end = map.get(s.charAt(i)) > end ? map.get(s.charAt(i)) : end;

            if (i == end) {
                list.add(size);
                size = 0;
            }
        }

        return list;
    }
}
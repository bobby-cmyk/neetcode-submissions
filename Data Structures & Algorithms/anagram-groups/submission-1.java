class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            String curr = strs[i];
            HashMap<Character, Integer> wordMap = new HashMap<>();

            for (int j = 0; j < curr.length(); j++) {

                char c = curr.charAt(j);

                if (wordMap.containsKey(c)) {
                    wordMap.put(c, wordMap.get(c) + 1);
                }
                else {
                    wordMap.put(c, 1);
                }
            }

            if (map.containsKey(wordMap)) {
                List list = map.get(wordMap);
                list.add(curr);
                map.put(wordMap, list);
            }
            else {
                List<String> list = new ArrayList<>();
                list.add(curr);
                map.put(wordMap, list);
            }
        }

        List<List<String>> ans = new ArrayList<>(map.values());

        return ans;

    }
}

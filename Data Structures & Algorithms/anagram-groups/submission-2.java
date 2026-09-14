class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // what is the tradeoff between using hashamp as key vs array as key?
        // what exactly is this method of using 26 slots as array?
        // why do we need to convert the int array to string to use a key?
        Map<String, List<String>> map = new HashMap<>();

        for (int i  = 0; i < strs.length; i++) {

            String str = strs[i];
            
            int[] arr = new int[26];

            for (int j = 0; j < str.length(); j++) {
                arr[str.charAt(j)-'a']++;
            }

            String key = Arrays.toString(arr);

            List<String> group = map.get(key);

            if (group == null) {
                group = new ArrayList<>();
                group.add(str);
                map.put(key, group);
            }
            else {
                group.add(str);
                map.put(key, group);
            }
        }

        return new ArrayList<>(map.values());

    }
}

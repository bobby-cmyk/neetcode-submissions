class Solution {
    public boolean isAnagram(String s, String t) {
         
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
         }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            if (map.containsKey(c)) {
                int freq = map.get(c);

                if (freq - 1 == 0) {
                    map.remove(c);
                } 
                else {
                    map.put(c, freq - 1);
                }
            }

            else {
                return false;
            }
        }

        return map.isEmpty();
    }
}

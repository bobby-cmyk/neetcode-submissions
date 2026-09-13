class Solution {
    public boolean isAnagram(String s, String t) {
         
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            map.put(c, map.getOrDefault(c, 0) + 1);
         }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            Integer freq = map.get(c);

            if (freq == null) {
                return false;
            }
            else if (freq - 1 == 0) {
                map.remove(c);
            }
            else {
                map.put(c, freq - 1);
            }
        }

        return map.isEmpty();
    }
}

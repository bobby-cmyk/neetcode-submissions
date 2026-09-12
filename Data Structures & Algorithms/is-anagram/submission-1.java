class Solution {

    // to check if two strings are anagrams
    // one way we could do is to use hashmaps
    // for each hashmap,
    // the key, will be the character, the value will be the count of the character in the string
    // we can compare the hashmap

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        else {
            // initialise two hashamps
            Map<Character, Integer> mapS = new HashMap<>();
            Map<Character, Integer> mapT = new HashMap<>();
            
            for (int i = 0; i < s.length(); i++) {
                char currSChar = s.charAt(i);
                char currTChar = t.charAt(i);

                mapS.put(currSChar, mapS.getOrDefault(currSChar, 0) + 1);
                mapT.put(currTChar, mapT.getOrDefault(currTChar, 0) + 1);
            }

            return (mapS.equals(mapT));
        }
    }
}

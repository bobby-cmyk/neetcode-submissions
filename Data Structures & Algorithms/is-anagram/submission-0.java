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

                Integer valueS = 1;

                if (mapS.containsKey(currSChar)) {
                    valueS += mapS.get(currSChar);
                }

                Integer valueT = 1;

                if (mapT.containsKey(currTChar)) {
                    valueT += mapT.get(currTChar);
                }

                mapS.put(currSChar, valueS);
                mapT.put(currTChar, valueT);
            }

            if (mapS.equals(mapT)) {
                return true;
            }
            else {
                return false;
            }
        }
    }
}

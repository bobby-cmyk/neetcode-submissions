class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (Character.isLetter(c) || Character.isDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        String s2 = sb.toString();

        int l = 0;
        int r = s2.length() - 1;

        while (l < r) {

            if (s2.charAt(l) != s2.charAt(r)) {
                return false;
            }
            else {
                l++;
                r--;
            }
        }

        return true;
    }
}

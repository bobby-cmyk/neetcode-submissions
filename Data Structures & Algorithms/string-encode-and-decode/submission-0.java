class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length());
            sb.append("#");    
            sb.append(str);
            
        }

        return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> list = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {
            
            int j = i;

            StringBuilder sb = new StringBuilder();

            while (str.charAt(j) != '#') {
                sb.append(str.charAt(j));
                j++;
                i++;
            }
            i++; // skip the #

            String strLength = sb.toString();
            Integer length = Integer.valueOf(strLength);

            StringBuilder sb2 = new StringBuilder();

            for(int k = i; k < j + length +1; k++) {
                sb2.append(str.charAt(k));
            }

            list.add(sb2.toString());

            i += length;
        }

        return list;
    }
}

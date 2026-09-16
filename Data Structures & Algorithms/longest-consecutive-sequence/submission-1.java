class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        List<Integer> startNums = new ArrayList<>();

        for (int num : nums) {
            
            if (!set.contains(num - 1)) {
                startNums.add(num);
            }
        }

        int longest = 0;

        for (int startNum : startNums) {
            
            int length = 0;

            while (true) {

                if (set.contains(startNum)) {
                    length++;
                    startNum++;
                }
                else {
                    break;
                }
            }

            if (length > longest) {
                longest = length;
            }
        }

        return longest;
    }
}

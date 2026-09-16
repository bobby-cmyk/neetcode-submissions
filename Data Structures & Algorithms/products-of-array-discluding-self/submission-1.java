class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int l = nums.length;

        int[] res = new int[l];

        int prefix = 1;
 
        for (int i = 0; i < l; i++) {
            res[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;

        for (int i = l - 1; i >=0; i--) {
            res[i] *= suffix;
            suffix *= nums[i];
        }

        return res;
    }
}  

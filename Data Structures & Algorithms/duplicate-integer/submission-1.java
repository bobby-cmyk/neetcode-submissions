class Solution {

    // So previously, I have showed you the with set, this metod has time complexity of O(n) and space complexity O(n)
    // However, if we have space limitations, we can also check if this array has duplicate with a space complexity of O(1) constant time
    // But this will result in a slower time complexity of O(n log n)
    // We can do this by sortin the array, this will be an in-place sorting, this will sort the integers in O(n log n) time
    // then, we will loop through the sorted array, we will check if the number is same as its adjacent integer  
    public boolean hasDuplicate(int[] nums) {
        // Sort the array
        Arrays.sort(nums);

        // assume that the array is more than 1 nums.length > 1;
        for (int i = 1; i < nums.length; i++) {
            int currNum = nums[i];
            int prevNum = nums[i-1];

            // if currNum is same as prevNum
            // then it means that it is a duplicate 
            if (currNum == prevNum) {
                return true;
            }
        }

        return false;
    }
}
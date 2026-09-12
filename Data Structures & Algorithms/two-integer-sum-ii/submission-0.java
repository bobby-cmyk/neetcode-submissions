class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        int[] ans = {left + 1, right + 1};

        while (true) {

            int sum = numbers[left] + numbers[right];

            if (sum > target) {
                right -= 1;
                continue;
            }
            else if (sum < target) {
                left += 1;
                continue;
            }
            else {
                ans[0] = left + 1;
                ans[1] = right + 1;
                break;
            }
        }

        return ans;
    }
}

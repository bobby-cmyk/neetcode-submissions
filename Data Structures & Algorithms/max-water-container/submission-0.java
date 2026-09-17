class Solution {
    public int maxArea(int[] heights) {
        
        int l = 0;
        int r = heights.length - 1;

        int max = -1;

        while (l < r) {

            int lower = Math.min(heights[l], heights[r]);

            int area = (r - l) * lower;

            max = Math.max(max, area);

            if (lower == heights[l]) {
                l++;
            }
            else {
                r--;
            }
        }

        return max;
    }
}

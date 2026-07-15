//Problem link: https://leetcode.com/problems/largest-number-at-least-twice-of-others

class Solution {
    public int dominantIndex(int[] nums) {

        int ans = 0;
        int max = -1;
        int smax = -1;
        int maxIndex = 0;

        for (int i = 0; i<nums.length;i++){
            if(max < nums[i]){
                smax = max;
                max = nums[i];
                maxIndex = i;
            } else if(smax < nums[i]){
                smax = nums[i];
            }
        }
        if (max >= 2 * smax ){
            return maxIndex;
        } else {
            return -1;
        }
    }
}

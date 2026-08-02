// This solution is applicable for two problem num: 724 & 1991
// 724 link : https://leetcode.com/problems/find-pivot-index
// 1991 link: https://leetcode.com/problems/find-the-middle-index-in-array 

class Solution {
    public int pivotIndex(int[] nums) {
        int rsum = 0;

        for (int ele : nums){
            rsum += ele;
        }

        int lsum = 0;

        for (int i=0; i<nums.length;i++){
            rsum -= nums[i];

            if(rsum == lsum){
                return i;
            }

            lsum += nums[i];
        }
        return -1;
    }
}

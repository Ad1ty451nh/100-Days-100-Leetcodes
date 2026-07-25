// Problem link: https://leetcode.com/problems/single-number/description/

class Solution {
    public int singleNumber(int[] nums) {
        int answer = 0;

        for (int i : nums) {
            answer = answer ^ i;
        }
        return answer;
    }
}

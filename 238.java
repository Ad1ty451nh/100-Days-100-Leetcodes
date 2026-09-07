class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        int leftproducts = 1;

        for(int i=0;i < nums.length;i++){
            answer[i] = leftproducts;
            leftproducts *= nums[i];
        }

        int rightproducts = 1;

        for(int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= rightproducts;
            rightproducts *= nums[i];
        }
        return answer;
    }
}

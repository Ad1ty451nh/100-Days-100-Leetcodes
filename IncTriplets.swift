// Problem link: 
class Solution {
    func increasingTriplet(_ nums: [Int]) -> Bool {
        var first = Int.max
        var second = Int.max
        var third = Int.max

        for i in 0..<nums.count {
            var ele = nums[i]

            if(first >= ele){
                first = ele
            } else if(second >= ele) {
                second = ele
            } else {
                return true;
            }
        }
        return false;
    }
}

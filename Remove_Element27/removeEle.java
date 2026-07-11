class Solution {
    func removeElement(_ nums: inout [Int], _ val: Int) -> Int {
        var ptr = 0

        for i in 0..<nums.count{

            if nums[i] != val{
                nums[ptr] = nums[i]
                ptr += 1
            }
        }
        return ptr
    }
}
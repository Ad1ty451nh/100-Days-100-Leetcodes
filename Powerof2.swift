Problem Link: https://leetcode.com/problems/power-of-two/


class Solution {
    func isPowerOfTwo(_ n: Int) -> Bool {

        if n < 1 {
            return false
        }

        var num = n

        while num % 2 == 0 {
            num /= 2
        }

        return num == 1
    }
}

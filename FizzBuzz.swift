Problem Link: https://leetcode.com/problems/fizz-buzz/


class Solution {
    func fizzBuzz(_ n: Int) -> [String] {
        var ans: [String] = []

        for i in 1...n {
            if i % 3 == 0 && i % 5 == 0 {
                ans.append("FizzBuzz")
            } else if i % 3 == 0 {
                ans.append("Fizz")
            } else if i % 5 == 0 {
                ans.append("Buzz")
            } else {
                ans.append(String(i))
            }
        }

        return ans
    }
}

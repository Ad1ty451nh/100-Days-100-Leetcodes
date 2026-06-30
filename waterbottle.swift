Problem link: https://leetcode.com/problems/water-bottles/

class Solution {
    func numWaterBottles(_ numBottles: Int, _ numExchange: Int) -> Int {

        var bottles = numBottles
        var ans = numBottles
        
        while bottles >= numExchange {
             var newBottles =  bottles / numExchange 

             var remBottles = bottles % numExchange 

             ans = ans + newBottles

             bottles = newBottles + remBottles

        }
        return ans 
    }
}

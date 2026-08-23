class Solution {
    public boolean isPalindrome(int x) {
        if(0>x){
            return false;
        }
        int b = x;
        int rev = 0;
        
        while(b>0){
            int a = b%10;
            
            rev = rev*10 + a;
            
            b = b/10;
        }
        
        if (rev == x){
            return true;
        } else {
            return false;
        }
    }
}
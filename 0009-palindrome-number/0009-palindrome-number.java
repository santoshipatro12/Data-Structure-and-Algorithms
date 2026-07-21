class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;
        int copy = x;
        int rev = 0;
        while(x !=0){
            int dig = x % 10;
            x/=10;

             rev = (rev*10) + dig;
        }
        return copy==rev;
    
    }
}
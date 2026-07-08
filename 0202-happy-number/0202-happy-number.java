import java.util.*;
class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> list = new ArrayList <>();
       int sum = 0;
       while(true){
        sum = 0;
        while(n>0){
            int dig = n%10;
            sum += dig*dig;
            n/=10;
        }
        if(sum==1) return true;
        if(list.contains(sum)) return false;
        else list.add(sum);

        n=sum;
       } 
    }
}
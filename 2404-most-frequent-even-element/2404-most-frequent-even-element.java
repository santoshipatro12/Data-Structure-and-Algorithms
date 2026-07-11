import java.util.*;
class Solution {

    public int mostFrequentEven(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap <>();

        for(int i=0; i< nums.length; i++){
            if(nums[i]%2==0){
                if(map.containsKey(nums[i])){
                    map.put(nums[i], map.get(nums[i])+1);
                }else {
                    map.put(nums[i], 1);
                }
            }
        }
        int maxFreq =0, ans =-1;
        for(int key : map.keySet()){
            if(maxFreq < map.get(key)){
                maxFreq=  map.get(key);
                ans = key;
            }else if(maxFreq == map.get(key)){
                ans = Math.min(key, ans);
            }
        }
        return ans;
    }
}
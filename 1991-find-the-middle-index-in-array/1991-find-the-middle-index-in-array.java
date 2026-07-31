class Solution {
    public int findMiddleIndex(int[] nums) {
       int x=0, y=0;
       for(int i=0; i<nums.length; i++){
            x+=nums[i];
        }
        for(int i=0; i<nums.length; i++){
            if(y==x-y-nums[i]) return i;
            y+=nums[i];
        } 
        return -1;
    }
}
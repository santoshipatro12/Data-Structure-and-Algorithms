class Solution {
    public int[] sortedSquares(int[] nums) {
       int tp[] = new int[nums.length];
      
       int i=0, j= nums.length-1, k = tp.length-1;
       while(k>=0){
        if(Math.abs(nums[i]) > Math.abs(nums[j])){
            tp[k--] = nums[i]*nums[i++];
        }else{
            tp[k--] = nums[j]*nums[j--];
        }
       }
       return tp;
    }
}
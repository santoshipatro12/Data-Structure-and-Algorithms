class Solution {
    public int maxSubArray(int[] nums) {
        int MaxSum = nums[0];
        int currSum = 0;

        for(int i : nums){
            currSum +=i;
            MaxSum = Math.max(currSum, MaxSum);

            if(currSum < 0){
                currSum = 0;
            }
        }
        return MaxSum;
    }
}
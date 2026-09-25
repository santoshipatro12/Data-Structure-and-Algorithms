class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]>=nums.length){
                i++;
                continue;
            }
            int crtIdx = nums[i];
            if(nums[i]!= nums[crtIdx]){
                swap(nums, i, crtIdx);
            }else{
                i++;
            }
        }
        for(int j=0; j<nums.length; j++){
            if(j!=nums[j]) return j;
        }
        return nums.length;
    }
    

        public void swap(int[]nums, int i, int crtIdx){
            int temp = nums[i];
            nums[i] = nums[crtIdx];
            nums[crtIdx] = temp;
        }
}
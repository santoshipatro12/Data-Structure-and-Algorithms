class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        int temp =0, i=0;
        while(i<nums.length){
            if(temp == nums[i]){
                i++; temp++;
            }else{
                return temp;
            }
        }
        return temp;
    }
}
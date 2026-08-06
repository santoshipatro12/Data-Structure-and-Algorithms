class Solution {
    public void sortColors(int[] nums) {
        int i=0, j=0, k= nums.length-1;
        while(i<=k){
            if(nums[i]==0){
                swap(i,j, nums);
                i++; j++;
            }else if(nums[i]==2){
                swap(i,k, nums);
                k--;
            }else i++;
        }
    }
        public void swap(int i, int j, int[] nums){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j]= temp;
        }
    
}
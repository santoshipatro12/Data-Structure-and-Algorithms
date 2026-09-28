class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length){
            int CI = nums[i]-1;

            if(nums[i]!= nums[CI]){
                swap(nums,i, CI);
            }else i++;
        }

        List <Integer> ans = new ArrayList <>();

        for(int j=0; j<nums.length; j++){
            if(nums[j]!= j+1){
                ans.add(nums[j]);
            }
        }
        return ans;
 
    }
      public void swap(int []nums, int i, int j){
            int temp = nums[i];
            nums[i]= nums[j];
            nums[j] = temp;
    }

}
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count =0;
        int currSum =0;

        HashMap <Integer, Integer> map = new HashMap <>();

        map.put(0,1);

        for(int num : nums){
            currSum += num;

            int required = currSum - k;

            if(map.containsKey(required)){
                count+= map.get(required);
            }
            map.put(currSum, map.getOrDefault(currSum,0)+1);
        }
        return count;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap <>();

        for(int num :nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        ArrayList <Map.Entry<Integer, Integer>> List = new ArrayList<>(map.entrySet());

        List.sort((a,b) -> b.getValue()-a.getValue());

        int []result = new int[k];
        for(int i=0; i<k;i++){
            result[i] = List.get(i).getKey();
        }
        return result;
    }
}
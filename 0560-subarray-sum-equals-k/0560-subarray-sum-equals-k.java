class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixSum =0;
        int count =0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int x: nums) {
            prefixSum+=x;
            count+= map.getOrDefault(prefixSum - k,0);
            map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums) {
            if (map.compute(i, (key, old) -> (old != null) ? old + 1 : 1) > nums.length / 2) {
                return i;
            }
        }
        return 0;
    }
}
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i: nums) {
            set.add(i);
        }
        int res =0;
        for(int i: set) {
            if(!set.contains(i-1)) {
                int ros =1;
                while(set.contains(i+ros)) {
                    ros++;
                }
                res = Math.max(res, ros);
            }
        }
        return res;
    }
}
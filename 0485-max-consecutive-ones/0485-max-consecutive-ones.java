class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i =0;
        int ans =0;
        while(i<nums.length) {
            int ros =0;
            while(i<nums.length && nums[i++]==1){
                ros++;
            }
            ans = Math.max(ans,ros);
        }
        return ans;
    }
}
class Solution {
    public void moveZeroes(int[] nums) {
        int right =0;
        int left =0;
        while(right<nums.length){
            while(right<nums.length && nums[right] == 0) {
                right++;
            }
            if(right<nums.length) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right++;
            }
        }
    }
}
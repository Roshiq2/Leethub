class Solution {
    public void rotate(int[] nums, int k) {
        int start =0;
        int end = nums.length-1;
        k%=nums.length;
        reverseArray(nums, start, end-k);
        reverseArray(nums, end-k+1, end);
        reverseArray(nums, start, end);
    }

    public void reverseArray(int[] nums, int start, int end) {
        while(start<end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start]=temp;
            start++;
            end--;
        }
    }
}
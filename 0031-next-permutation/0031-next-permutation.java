class Solution {
    public void nextPermutation(int[] nums) {
        int idx =-1;
        for(int i= nums.length-2;i>=0;i--) {
            if(nums[i]<nums[i+1]) {
                idx = i;
                break;
            }
        }
        if(idx==-1) {
            reverse(0,nums.length-1,nums);
            return;
        }
        for(int i= nums.length-1;i>idx;i--) {
            if(nums[i] > nums[idx]) {
                int temp =nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }
        reverse(idx+1, nums.length-1, nums);
    }

    static void reverse(int i,int j , int[] nums) {
        while(i<=j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
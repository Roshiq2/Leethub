class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
            int n = nums.length-1;
            List<List<Integer>> ros = new ArrayList();
            int i =0;
            while(i<n-1) {
                int j = i+1;
                int k = n;
                 while (j < k) {
                     int sum = nums[i]+ nums[j]+nums[k];
                     if(sum ==0) {
                         ros.add(List.of(nums[i],nums[j],nums[k]));
                         while(j<k && nums[j]==nums[j+1]) j++;
                         while(j<k && nums[k] == nums[k-1]) k--;
                         j++;
                         k--;
                     }
                     else if (sum < 0) j++;
                     else k--;
                 }
                 while(i<n-1 && nums[i]==nums[i+1]) i++;
                 i++;
            }
            return ros;
    }
}
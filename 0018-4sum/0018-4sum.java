class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length-1;
        List<List<Integer>> ros = new ArrayList();
        int x=0;
        while(x<n-2) {
            int i = x+1;
            while (i < n - 1) {
                int j = i + 1;
                int k = n;
                while (j < k) {
                    long sum =(long) nums[x]+ nums[i] + nums[j] + nums[k];
                    if (sum == target) {
                        ros.add(List.of(nums[x], nums[i], nums[j], nums[k]));
                        while (j < k && nums[j] == nums[j + 1]) j++;
                        while (j < k && nums[k] == nums[k - 1]) k--;
                        j++;
                        k--;
                    } else if (sum < target) j++;
                    else k--;
                }
                while (i < n - 1 && nums[i] == nums[i + 1]) i++;
                i++;
            }
            while (x < n - 2 && nums[x] == nums[x + 1]) x++;
            x++;
        }
        return ros;
    }
}
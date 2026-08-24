class Solution {
    public List<Integer> spiralOrder(int[][] nums) {
        int right = 0;
        int down = 0;
        int left = nums[0].length-1;
        int up = nums.length-1;
        List<Integer> ros = new ArrayList();

        while (down <= up && right <= left) {
            for (int i = right; i <= left; i++) {
                ros.add(nums[down][i]);
            }
            down++;
            for (int i = down; i <= up; i++) {
                ros.add(nums[i][left]);
            }
            left--;
            if(down <= up) {
                for (int i = left; i >= right; i--) {
                    ros.add(nums[up][i]);
                }
                up--;
            }
            if(right <=left) {
                for (int i = up; i >= down; i--) {
                    ros.add(nums[i][right]);
                }
                right++;
            }
        }
        return ros;
    }
}
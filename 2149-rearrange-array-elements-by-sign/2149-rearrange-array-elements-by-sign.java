class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList();
        List<Integer> neg = new ArrayList();

        for(int i: nums) {
            if(i> 0) pos.add(i);
            else neg.add(i);
        }
        int x =0;
        for(int i=0;i<pos.size();i++) {
            nums[x++] = pos.get(i);
            nums[x++] = neg.get(i);
        }

        return nums;
    }
}
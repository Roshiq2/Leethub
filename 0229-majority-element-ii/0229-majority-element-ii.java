class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int n = nums.length / 3;
        List<Integer> ros= new ArrayList<>();
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int value = map.getOrDefault(nums[i],0)+1;
            map.put(nums[i],value);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>n){
                ros.add(entry.getKey());
            }
        }
        return ros;
    }
}
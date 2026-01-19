class Solution {
    public int findGCD(int[] nums) {
        int min =Integer.MIN_VALUE;
        int max =Integer.MAX_VALUE;

        for (int i :nums){
            min = min > i ? min : i;
            max = max < i ? max : i;
        }
        while (min>0 && max > 0){
            if(min>max){
                min = min %max;
            }else{
                max=max%min;
            }
        }
    
    return max ==0? min:max;
    }
}
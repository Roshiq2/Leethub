class Solution {
    public int reverse(int x) {
        int result =0;
        boolean negative = x < 0;
        x=Math.abs(x);    
        while(x>0) {
            int val = x%10;
            x=x/10;
            if(result>(Integer.MAX_VALUE-val)/10){
                return 0;
            }
            result = result*10 + val;
        }
        
        return negative ? -result : result;
    }
}
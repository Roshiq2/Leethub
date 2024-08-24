class Solution {
    public double myPow(double x, int n) {
        double ans=1.0;
        double power=n;
        if(power<0) power*=-1;
        while(power>0){
            if(power%2!=0){
                ans*=x;
                power-=1;
            }else{
                x*=x;
                power/=2;
            }
        }
        if(n<0) return 1.0/ans;
        return ans;
    }
}
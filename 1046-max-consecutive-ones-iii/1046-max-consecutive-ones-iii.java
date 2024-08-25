class Solution {
    public int longestOnes(int[] nums, int k) 
    {
            int l=0,r=0,n=nums.length,ans=0,z=0;

            while(r<n)
            {
                if(nums[r]==0) z++;
                while(z>k)
                {
                    if(nums[l]==0) z--;l++;
                }

                ans = Math.max(ans,r-l+1);
                r++;
            }    
            return ans;
    }
}
class Solution:
    def rob(self, nums: List[int]) -> int:
        def helper(n):
            if n<0:
                return 0
            if n==0:
                return nums[n]
            if dp[n]!=-1:
                return dp[n]
            pick=nums[n]+helper(n-2)
            notpick=helper(n-1)
            dp[n]=max(pick,notpick)
            return dp[n]

        n=len(nums)
        dp=[-1 for i in range(n)]
        return helper(n-1)     
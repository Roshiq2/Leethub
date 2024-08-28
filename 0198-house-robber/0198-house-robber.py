class Solution:
    def rob(self, nums: List[int]) -> int:
        @functools.cache
        def helper(n):
            if n<0:
                return 0
            if n==0:
                return nums[n]
            if dp[n]!=0:
                return dp[n]
            pick=nums[n]+helper(n-2)
            notpick=helper(n-1)
            return max(pick,notpick)
        n=len(nums)
        dp=[0 for i in range(n)]
        return helper(n-1)     
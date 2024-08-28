class Solution:
    def rob(self, nums: List[int]) -> int:
        @functools.cache
        def helper(n):
            if n<0:
                return 0
            if n==0:
                return nums[n]
            pick=nums[n]+helper(n-2)
            notpick=helper(n-1)
            return max(pick,notpick)

        n=len(nums)
        return helper(n-1)     
class Solution:
    def numSubarraysWithSum(self, nums: List[int], goal: int) -> int:
        def withAtMostSum(target):
            l,total,ans=0,0,0

            for r,num in enumerate(nums):
                total+=num
                while total>target and l<=r:
                    total-=nums[l]
                    l+=1
                ans += r-l+1
            return ans
        
        return withAtMostSum(goal)-withAtMostSum(goal-1)
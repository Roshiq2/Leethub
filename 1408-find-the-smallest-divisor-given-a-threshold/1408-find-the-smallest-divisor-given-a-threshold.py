import math
class Solution:
    def smallestDivisor(self, nums: List[int], threshold: int) -> int:
        lo=1
        hi=max(nums)
        ans=-1
        while lo<=hi:
            mid=(lo+hi)//2
            s=0
            for i in range(len(nums)):
                s+=math.ceil(nums[i]/mid)
            if s<=threshold:
                ans=mid
                hi=mid-1
            else:
                lo=mid+1
        return ans

        
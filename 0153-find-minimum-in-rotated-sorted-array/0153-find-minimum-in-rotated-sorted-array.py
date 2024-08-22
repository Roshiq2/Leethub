class Solution:
    def findMin(self, nums: List[int]) -> int:
        low=0
        high=len(nums)-1
        m=200000
        while low<=high:
            mid=low+(high-low)//2
            if nums[low]<=nums[high]:
                m=min(m,nums[low])
                break
            if nums[low]<=nums[mid]:
                m=min(m,nums[low])
                low=mid+1
            else:
                m=min(m,nums[mid])
                high=mid-1
        return m

        
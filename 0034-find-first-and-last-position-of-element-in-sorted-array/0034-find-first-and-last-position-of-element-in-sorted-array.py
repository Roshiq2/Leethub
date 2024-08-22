class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        n = len(nums)  # size of the array
        if n==1 :
            if target==nums[0]:
                return [0,0]
            else:
                return [-1,-1]
        low = 0
        high = n - 1
        res=[-1,-1]
        
        while low <= high:
            mid = (low + high) // 2
            if nums[mid] == target:
                res[0]=mid
                res[1]=mid
                while res[0]>0 and nums[res[0]-1] == target:
                    res[0]= res[0]-1
                while res[1]<n-1 and nums[res[1]+1] == target:
                    res[1]= res[1]+1
                return res
            elif target > nums[mid]:
                low = mid + 1
            else:
                high = mid - 1
        return res



            
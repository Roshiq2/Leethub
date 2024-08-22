class Solution:
    def singleNonDuplicate(self, nums: List[int]) -> int:
        n = len(nums)  # size of the array
        if n==1:
            return nums[0]
        if nums[0]!=nums[1]:
            return nums[0]
        if nums[-1]!=nums[-2]:
            return nums[-1]
        low = 1
        high = n - 2
        while low <= high:
            mid = low + (high-low) // 2
            if nums[mid-1] != nums[mid] != nums[mid+1]:
                return nums[mid]
            elif (mid%2!=0 and nums[mid-1]==nums[mid]) or (mid%2==0 and nums[mid+1]==nums[mid]):
                low = mid + 1
            else:
                high = mid - 1
        return -1
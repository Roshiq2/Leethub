class Solution:
    def search(self, nums: List[int], target: int) -> int:
        def binarySearch(nums: [int], low: int, high: int, target: int):
            if low > high:
                return -1  
            mid = (low + high) // 2
            if nums[mid] == target:
                return mid
            elif target > nums[mid]:
                return binarySearch(nums, mid + 1, high, target)
            return binarySearch(nums, low, mid - 1, target)
        return binarySearch(nums,0,len(nums) - 1, target)
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map = dict()
        for a,i in enumerate(nums):
            if target - i in map:
                return [map[target - i], a]
            map[i] = a
        return []
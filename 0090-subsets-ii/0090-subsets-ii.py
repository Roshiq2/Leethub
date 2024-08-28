class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        res = []
        subset = []

        def create_subset(i):
            if i == len(nums):
                if sorted(subset[:]) not in res:
                    res.append(sorted(subset[:]))
                return
            
            subset.append(nums[i])
            create_subset(i+1)

            subset.pop()
            create_subset(i+1)

        create_subset(0)
        return sorted(res)
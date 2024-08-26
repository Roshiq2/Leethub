class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        d = defaultdict(lambda :0)
        for i in nums:
            d[i] += 1

        return sorted(d,key=lambda x:d[x],reverse=True)[:k]
        
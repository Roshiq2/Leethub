class Solution:
    def subarraysWithKDistinct(self, nums: List[int], k: int) -> int:

        def subarraysWithAtMost(kEle):
            freq = defaultdict(int)
            l = ans = 0

            for r,num in enumerate(nums):
                freq[num]+=1
                while len(freq)>kEle:
                    freq[nums[l]]-=1
                    if freq[nums[l]]==0:
                        del freq[nums[l]]
                    l+=1
                
                ans+=r-l+1
            
            return ans

        return subarraysWithAtMost(k)-subarraysWithAtMost(k-1)
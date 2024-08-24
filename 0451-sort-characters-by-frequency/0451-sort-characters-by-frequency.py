class Solution:
    def frequencySort(self, s: str) -> str:
       d=sorted(Counter(s).items(),key=lambda x:x[1],reverse=True)
       return "".join([x * y for x, y in d])

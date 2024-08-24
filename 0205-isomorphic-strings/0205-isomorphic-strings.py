class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dic = {}
        for i, j in zip(s, t):
            if i not in dic and j not in dic.values() or i in dic and dic[i] == j:
                dic[i] = j
            else:
                return False
        return True
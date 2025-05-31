from typing import List

class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        def counter(ros):
            dic = {}
            for ch in ros:
                if ch in dic:
                    dic[ch] += 1
                else:
                    dic[ch] = 1
            return dic

        pd=counter(p)
        sd=counter(s[:len(p)])
        res=[]
        i=0
        j=len(p)
        while j<=len(s):
            if pd==sd:
                res.append(i)
            sd[s[i]]-=1
            if sd[s[i]]<=0:
                sd.pop(s[i])
            if j<len(s):    
                sd[s[j]] = sd.get(s[j], 0) + 1            
                i+=1
            j+=1

        return res

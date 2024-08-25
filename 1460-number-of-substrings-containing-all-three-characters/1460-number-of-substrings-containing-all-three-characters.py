class Solution:
    def numberOfSubstrings(self, s: str) -> int:
        count,i,j=0,0,0
        hashMap={'a':0,'b':0,'c':0}
        while i<len(s) and j<len(s):
            hashMap[s[j]]+=1
            while hashMap['a'] and hashMap['b'] and hashMap['c']:
                count+=len(s)-j
                hashMap[s[i]]-=1
                i=i+1
            j=j+1
        return count
                
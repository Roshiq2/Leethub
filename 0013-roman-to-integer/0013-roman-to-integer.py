class Solution:
    def romanToInt(self, s: str) -> int:
        m = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }
        num=0
        prev=1
        for i in reversed(s):
            if m[i]<prev:
                num-=m[i]
            else:
                num+=m[i]
            prev=m[i]
        return num

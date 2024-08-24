class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        n=len(s)
        ros=[]
        while n>0:
            s=s[1:]+s[0]
            ros.append(s)
            n-=1
        return True if goal in ros else False
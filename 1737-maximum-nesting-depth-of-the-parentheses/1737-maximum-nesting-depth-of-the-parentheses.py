class Solution:
    def maxDepth(self, s: str) -> int:
        stack=[]
        count=0
        m=0
        for i in s:
            if i=="(":
                stack.append(i)
                count+=1
            elif i==')':
                stack.pop()
                count-=1
            m=max(m,count)
        return m
        
        
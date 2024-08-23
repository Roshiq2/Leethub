class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        ros=0
        ret=''
        for i in s:
            if i=='(':
                if ros:
                    ret+=i
                ros+=1
            else:
                ros-=1
                if ros:
                    ret+=i
        return ret

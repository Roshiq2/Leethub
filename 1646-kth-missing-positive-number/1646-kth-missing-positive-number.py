class Solution:
    def findKthPositive(self, arr: List[int], k: int) -> int:
        c = 1
        t = 0
        while(k>0):
            if(t<len(arr)):
                if(arr[t]!=c):
                    k-=1
                    if(k == 0):
                        return(c)
                    c+=1
                elif(arr[t]==c):
                    c+=1
                    t+=1
            elif(t>=len(arr)):
                return(arr[-1]+k)
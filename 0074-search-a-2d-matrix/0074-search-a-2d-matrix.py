class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        def bs(arr,target):
            start=0
            end=len(arr)-1
            while start<=end:
                mid=start+(end-start)//2
                if(arr[mid]==target):
                    return True
                if arr[mid]<target:
                    start=mid+1
                else:
                    end=mid-1
            return False
        for i in matrix:
            if bs(i,target):
                return True
        return False
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
        for k,v in enumerate(matrix):
            if target <= v[-1]:
                if bs(v,target):
                    return True
        return False
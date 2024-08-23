class Solution:
    def findPeakGrid(self, mat: List[List[int]]) -> List[int]:
        def neigh(row, col):
            return [[row - 1, col], [row, col - 1], [row + 1, col], [row, col + 1]]
        row, col = 0, 0
        while True:
            ros = neigh(row, col)
            for i in ros:
                if i[0] == -1 or i[0] == len(mat) or i[1] == -1 or i[1] == len(mat[0]):
                    continue
                if mat[row][col] < mat[i[0]][i[1]]:
                    row, col = i[0], i[1]
                    break
            else:
                break
        return [row, col]
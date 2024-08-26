# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def averageOfLevels(self, root: Optional[TreeNode]) -> List[float]:
        level_sum, level_count = [], []
        def dfs(root, height):
            if not root:
                return
            if height > len(level_sum):
                level_sum.append(root.val)
                level_count.append(1)
            else:
                level_sum[height-1] += root.val
                level_count[height-1] += 1
            dfs(root.left, height+1)
            dfs(root.right, height+1)

        result = dfs(root, 1)
        return [level_sum[i]/level_count[i] for i in range(len(level_sum))]
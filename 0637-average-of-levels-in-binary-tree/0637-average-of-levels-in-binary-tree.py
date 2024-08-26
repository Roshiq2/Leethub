# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def averageOfLevels(self, root: Optional[TreeNode]) -> List[float]:
        result = []
        queue = deque([root])
        while queue:
            current_size = len(queue)
            current_total = 0
            for _ in range(current_size):
                node = queue.popleft()
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
                current_total += node.val
            result.append(current_total/current_size)
        return result    
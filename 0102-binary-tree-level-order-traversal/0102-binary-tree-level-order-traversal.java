/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ros=new ArrayList<>();
        level(ros,0,root);
        return ros;
    }
    public void level(List<List<Integer>> ros,int level, TreeNode root){
        if(root==null) return;
        if(ros.size()<=level){
            ros.add(new ArrayList<>());
        }
        ros.get(level).add(root.val);
        level(ros,level+1,root.left);
        level(ros,level+1,root.right);
    }
}
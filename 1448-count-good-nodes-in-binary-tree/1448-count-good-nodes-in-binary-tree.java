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
    int count = 0;
    public int goodNodes(TreeNode root) {
        if(root == null)
            return count;
        helper(root, Integer.MIN_VALUE);
        return count;
    }
    
    public void helper(TreeNode root, int min){
        if(root == null)
            return;
        if(root.val >= min)
            count++;
        
        helper(root.left, Math.max(root.val, min));
        helper(root.right, Math.max(root.val, min));
        
    }
}
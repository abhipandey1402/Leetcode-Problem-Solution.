/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int a = Math.min(p.val, q.val);
        int b = Math.max(p.val, q.val);
        return helper(root, a, b);
    }
    
    TreeNode helper(TreeNode root, int a, int b){
        if(root==null){
            return root;
        }
        if(root.val<a){
            return helper(root.right, a, b);
        }
        else if(root.val>b){
            return helper(root.left, a, b);
        }
        return root;
    }
}
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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        helper(root, l);
        TreeNode ans = new TreeNode(0);
        TreeNode cur = ans;
        for(int v : l){
            cur.right = new TreeNode(v);
            cur = cur.right;
        }
        return ans.right;
    }
    
    public void helper(TreeNode root, List<Integer> l){
       if(root==null){
           return;
       }
        helper(root.left, l);
        l.add(root.val);
        helper(root.right, l);
     }
}
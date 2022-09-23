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
    static int helper(TreeNode currNode,int num){
        if(currNode == null)
            return 0;
 
        num = num*10 + currNode.val;
 
        int left = helper(currNode.left,num);
        int right = helper(currNode.right,num);
        int temp = 0;
 
        if(currNode.left == null && currNode.right == null)
            temp += num;
 
        return temp + left + right;
 
    }
    public int sumNumbers(TreeNode root) {
        return helper(root,0);
    }
}
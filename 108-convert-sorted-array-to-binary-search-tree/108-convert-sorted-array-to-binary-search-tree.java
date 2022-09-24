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
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBst(nums, 0, nums.length-1);
    }
    
    TreeNode createBst(int[] a, int l, int h){
        if(l>h){
            return null;
        }
        int mid = l + (h-l)/2;
        TreeNode node = new TreeNode(a[mid]);
        node.left = createBst(a, l, mid-1);
        node.right = createBst(a, mid+1, h);
        return node;
    }
}
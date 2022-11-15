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
    int ps = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return createTree(preorder,inorder,0,inorder.length-1);
    }
    TreeNode createTree(int[] pre,int[] in,int is,int ie){
        if(is>ie)
            return null;
        
        TreeNode root = new TreeNode(pre[ps]);
        int rootInd = 0;
        for(int i=is;i<=ie;i++){
            if(pre[ps]==in[i]){
                rootInd = i;
                break;
            }
        }
        ps++;
        root.left = createTree(pre,in,is,rootInd-1);
        root.right = createTree(pre,in,rootInd+1,ie);
        return root;
    }
}

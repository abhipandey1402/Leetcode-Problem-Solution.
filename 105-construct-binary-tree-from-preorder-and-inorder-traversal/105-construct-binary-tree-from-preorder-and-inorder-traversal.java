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
    class PreIndex{
        int i ;
        PreIndex(int i){
            this.i = i;
        }
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        PreIndex preIndex = new PreIndex(0);
        return createTree(preorder,inorder,0,inorder.length-1,preIndex);
    }
    public TreeNode createTree(int[] pre,int[] ino,int s,int e,PreIndex p){
        if(s>e)
            return null;
        TreeNode root = new TreeNode(pre[p.i]);
        int rootInd = 0;
        for(int j = s;j<=e;j++){
            if(pre[p.i] == ino[j]){
                rootInd = j;
                break;
            }   
        }
        p.i++; 
        
        root.left = createTree(pre,ino,s,rootInd-1,p);
        root.right = createTree(pre,ino,rootInd+1,e,p);
        return root;
    }
    
}
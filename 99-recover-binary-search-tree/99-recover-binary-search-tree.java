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
    int i=0;
    public void recoverTree(TreeNode root) {
       ArrayList<Integer> inorder = new ArrayList<>();
        inorder(root, inorder);
        Collections.sort(inorder);
        update(root, inorder);
        return;
    }
    
    void inorder(TreeNode root, ArrayList<Integer> list){
        if(root==null){
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    
    void update(TreeNode root, ArrayList<Integer> list){
        if(root==null){
            return;
        }
        update(root.left, list);
        root.val = list.get(i);
        i++;
        update(root.right, list);
    }
    
}
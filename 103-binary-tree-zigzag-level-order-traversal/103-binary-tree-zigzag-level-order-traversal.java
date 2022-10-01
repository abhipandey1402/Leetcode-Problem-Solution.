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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       List<List<Integer>> ans = new ArrayList<>(); 
        
        if(root==null){
            return ans;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        int level = 0;
        
        while(!q.isEmpty()){
            List<Integer> l = new ArrayList<>();
            int n = q.size();
            for(int i=0; i<n; i++){
                TreeNode temp = q.poll();
                l.add(temp.val);
                if(temp.left!=null){
                    q.offer(temp.left); 
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
            if(level%2==1){
                Collections.reverse(l);
            }
            ans.add(l);
            level++;
        }
        return ans;
    }
}
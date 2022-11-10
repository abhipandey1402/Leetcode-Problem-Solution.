/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] nums) {
     HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        
        int ans = set.size();
        ListNode curr = head;
        
        while(curr.next != null){
            if(set.contains(curr.val) && set.contains(curr.next.val)){
                ans--;
            }
            curr = curr.next;
        }
        return ans;
    }
}
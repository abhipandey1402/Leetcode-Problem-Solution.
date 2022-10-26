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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode Dummy = new ListNode(0);
        ListNode prev = Dummy;
        
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        
        while(curr1 != null && curr2 != null){
            if(curr1.val <= curr2.val){
                prev.next = curr1;
                prev = curr1;
                curr1 = curr1.next;
            }
            else{
                prev.next = curr2;
                prev = curr2;
                curr2 = curr2.next;
            }
        }
        if(curr1 != null){
            prev.next = curr1;
        }
        if(curr2 != null){
            prev.next = curr2;
        }
        return Dummy.next;
    }
}
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right){
            return head;
        }
        
        ListNode startPrev = null, start = null, end = null, endNext = null, temp = head;
        
        int i = 1;
        while(i<=right){
            if(i < left)
                startPrev = temp;
            if(i == left)
                start = temp;
            if(i == right){
                end = temp;
            endNext = temp.next;
            }
            i++;
        temp = temp.next;
        }
        end.next = null;
        end = reverse(start);
        if(startPrev != null)
            startPrev.next = end;
        else
            head = end;
        start.next = endNext;
        return head;
    }
    
    public ListNode reverse(ListNode node){
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = node;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode temp = head;
        while(temp != null){
            ListNode next = temp.next; // store next
            temp.next = prev; // assign previous to current as a next
            prev = temp;    //update prev
            temp = next;   // store next from next(already stored) bcz we are removing temp.next to prev, so if we not store then we will lost next element  
        }
        // prev — which now points to the new head of the reversed list.
        // we are doing temp = next => so temp at last is pointing to null
        return prev;
    }
}
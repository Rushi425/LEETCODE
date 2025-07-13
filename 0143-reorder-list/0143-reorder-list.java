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
    public static ListNode mid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    //reverse second half
    public static ListNode reverse(ListNode head){
        ListNode mid = mid(head);
        ListNode temp = mid.next;
        ListNode prev = null;
        mid.next = null; // cut the half
        while(temp != null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        // prev is head of second half reversed LL, and head is first half
        ListNode first = head, second = prev;
        while(second != null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next; 

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
        return head;
    }
    public void reorderList(ListNode head) {
        reverse(head); 
    }
}
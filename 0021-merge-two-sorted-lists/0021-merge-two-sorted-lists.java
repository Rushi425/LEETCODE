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
        if(list1 == null && list2 == null) return list1;
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode merged = new ListNode(-1);
        ListNode dummy = merged;
        while(temp1 != null && temp2 != null){
            if(temp1.val < temp2.val){
                dummy.next = temp1;
                temp1= temp1.next;
            }
            else{
                dummy.next = temp2;
                temp2 = temp2.next;
            }
            dummy = dummy.next;
        }
        if(temp1 != null) dummy.next = temp1; 
        if(temp2 != null) dummy.next = temp2; 

        return merged.next;
    }
}
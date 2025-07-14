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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode res = new  ListNode(0);
        ListNode dummy = res;
        int carry = 0;
        while(temp1 != null || temp2 != null || carry != 0){
            int val1 = temp1 != null ? temp1.val : 0;
            int val2 = temp2 != null ? temp2.val : 0;

            int sum = val1 + val2 + carry;
            if(sum >= 10){
                sum = sum - 10; // 17 - 10 => 7 sum -> add in res LL
                carry = 1;  // if digits are single then always caary is 1
                //logic for adding
                dummy.next = new ListNode(sum);
                dummy = dummy.next;
                if(temp1 != null) temp1 = temp1.next;
                if(temp2 != null) temp2 = temp2.next;
                //reset sum.
                sum = 0;
            }
            else{
                // loggic for adding
                dummy.next = new ListNode(sum);
                dummy = dummy.next;
                if(temp1 != null) temp1 = temp1.next;
                if(temp2 != null) temp2 = temp2.next;
                carry = 0;
            }
        }
        return res.next;
    }
}
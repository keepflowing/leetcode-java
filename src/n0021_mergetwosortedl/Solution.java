package n0021_mergetwosortedl;

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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while(l1 != null && l2 != null) {
            if(l2.val < l1.val) {
                tail.next = l2;
                l2 = l2.next;
            }
            else {
                tail.next = l1;
                l1 = l1.next;
            }
            tail = tail.next;
        }

        if(l1 != null) tail.next = l1;
        else tail.next = l2;

        return dummy.next;
    }
}
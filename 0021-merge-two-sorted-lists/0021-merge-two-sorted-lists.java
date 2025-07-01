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
        ListNode copy = null, head = null, tail = null;
        ListNode fp = list1, sp = list2;
        while (fp != null || sp != null) {
            if (fp != null && sp != null) {
                if (fp.val <= sp.val) {
                    copy = fp;
                    fp = fp.next;
                } else {
                    copy = sp;
                    sp = sp.next;
                }
            } else if (fp != null) {
                copy = fp;
                fp = fp.next;
            } else {
                copy = sp;
                sp = sp.next;
            }

            tail = insertAtEnd(tail, copy.val);
            if (head == null) {
                head = tail;
            }
        }

        return head;
    }

    private ListNode insertAtEnd(ListNode tail, int data) {
        ListNode node = new ListNode(data);
        if (tail != null) {
            tail.next = node;    
        }

        return node;
    }
}
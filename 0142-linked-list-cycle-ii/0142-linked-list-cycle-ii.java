/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head, fast = head;

        while (true) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == null || fast == null || fast.next == null) return null;
            if (slow == fast) {
                ListNode third = head;
                while (third != fast) {
                    third = third.next;
                    fast = fast.next;
                }

                return third;
            }
        }
    }
}
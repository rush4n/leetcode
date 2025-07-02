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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        int n = findLength(head);
        int reversePoint = n / 2;
        if (n % 2 == 1) reversePoint = (n / 2) + 1; 

        ListNode prev = findKthNode(head, reversePoint - 1);
        ListNode reversePointNode = findKthNode(head, reversePoint);

        ListNode head2 = reverse(reversePointNode, prev);

        ListNode first = head, second = head2;

        while (first != null && second != null) {
            if (first.val != second.val) return false;
            first = first.next;
            second = second.next;
        }

        return true;
    }

    private int findLength(ListNode head) {
        ListNode current = head;
        int length = 0;
        while (current != null) {
            current = current.next;
            length++;
        }

        return length;
    }

    private ListNode findKthNode(ListNode head, int k) {
        ListNode current = head;
        for (int i = 0; i < k; i++) current = current.next;

        return current;
    }

    private ListNode reverse(ListNode node, ListNode prev) {
        ListNode f = node, s = node.next;
        
        while (f != null && s != null) {
            ListNode temp = s.next;
            s.next = f;
            f = s;
            s = temp;
        }

        prev.next.next = null;
        prev.next = f;

        return f;
    }
}
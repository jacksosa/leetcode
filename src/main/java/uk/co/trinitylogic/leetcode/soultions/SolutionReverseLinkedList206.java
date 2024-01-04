package uk.co.trinitylogic.leetcode.soultions;

import uk.co.trinitylogic.leetcode.soultions.models.ListNode;

public class SolutionReverseLinkedList206 {

    // https://leetcode.com/problems/reverse-linked-list/

    public ListNode reverseListRec(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode r = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return r;
    }

    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode c = head;
        ListNode p = null;

        while (c != null) {
            ListNode n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        return p;
    }
}

package uk.co.trinitylogic.leetcode.soultions;

import uk.co.trinitylogic.leetcode.soultions.models.ListNode;

public class SolutionRemoveLinkedListElements203 {

    // https://leetcode.com/problems/remove-linked-list-elements/

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode d = new ListNode();
        d.next = head;
        ListNode c = d;

        while (c.next != null) {
            if (c.next.val == val) {
                c.next = c.next.next;
            } else {
                c = c.next;
            }
        }
        return d.next;
    }
}

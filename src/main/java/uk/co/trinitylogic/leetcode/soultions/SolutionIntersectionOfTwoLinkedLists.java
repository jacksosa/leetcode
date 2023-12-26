package uk.co.trinitylogic.leetcode.soultions;

import uk.co.trinitylogic.leetcode.soultions.models.ListNode;

public class SolutionIntersectionOfTwoLinkedLists {

    // https://leetcode.com/problems/intersection-of-two-linked-lists/

    private static int length(ListNode node) {
        int len = 0;
        ListNode tmp = node;
        while (tmp.next != null) {
            tmp = tmp.next;
            len++;
        }
        return len;
    }

    private static ListNode shift(ListNode node, int num) {
        for (int i = 0; i < num; i++) {
            node = node.next;
        }
        return node;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }

        int lenA = length(headA);
        int lenB = length(headB);
        int len = lenA;

        if (lenA > lenB) {
            headA = shift(headA, (lenA - lenB));
        }

        if (lenB > lenA) {
            len = lenB;
            headB = shift(headB, (lenB - lenA));
        }

        if (len <= 1) {
            if (headA == headB) {
                return headA;
            }
            return null;
        }

        // we now have them at the same start so lets find the join
        for (int i = 0; i < len; i++) {

            if (headA == headB) {
                return headA;
            }

            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}

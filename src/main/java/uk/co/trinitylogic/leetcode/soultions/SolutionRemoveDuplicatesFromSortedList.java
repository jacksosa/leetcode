package uk.co.trinitylogic.leetcode.soultions;

import uk.co.trinitylogic.leetcode.soultions.models.ListNode;

public class SolutionRemoveDuplicatesFromSortedList {

    // https://leetcode.com/problems/remove-duplicates-from-sorted-list/

    public ListNode deleteDuplicates(ListNode node) {
        if (node == null) {
            return node;
        }
        ListNode current = node;
        while (current.next != null) {
            ListNode next = current.next;
            if (current.val == next.val) {
                current.next = next.next;
            } else {
                current = next;
            }
        }
        return node;
    }
}

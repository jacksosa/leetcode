package uk.co.trinitylogic.leetcode.soultions;

import uk.co.trinitylogic.leetcode.soultions.models.ListNode;

import java.util.HashSet;
import java.util.Set;


public class SolutionLinkedListCycle141 {

    // https://leetcode.com/problems/linked-list-cycle/
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        Set<ListNode> memo = new HashSet<>();
        do {
            if (memo.contains(head)) {
                return true;
            }
            memo.add(head);
            head = head.next;
        } while (head.next != null);
        return false;
    }
}

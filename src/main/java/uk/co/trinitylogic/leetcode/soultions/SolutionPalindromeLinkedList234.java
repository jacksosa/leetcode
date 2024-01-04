package uk.co.trinitylogic.leetcode.soultions;

import uk.co.trinitylogic.leetcode.soultions.models.ListNode;

public class SolutionPalindromeLinkedList234 {

    // https://leetcode.com/problems/palindrome-linked-list/

    public boolean isPalindrome(ListNode head) {
        StringBuilder bs = new StringBuilder();
        while (head != null) {
            bs.append(head.val);
            head = head.next;
        }
        return bs.toString().contentEquals(bs.reverse());
    }
}

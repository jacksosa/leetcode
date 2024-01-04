package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;
import uk.co.trinitylogic.leetcode.soultions.models.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionPalindromeLinkedList234Test {

    @Test
    void isPalindrome_Example_1() {
        ListNode input = new ListNode(1);
        ListNode node2a = new ListNode(2);
        ListNode node2b = new ListNode(2);
        ListNode node1 = new ListNode(1);
        input.next = node2a;
        node2a.next = node2b;
        node2b.next = node1;
        boolean output = true;
        SolutionPalindromeLinkedList234 target = new SolutionPalindromeLinkedList234();
        boolean result = target.isPalindrome(input);
        assertEquals(output, result);
    }

    @Test
    void isPalindrome_Example_2() {
        ListNode input = new ListNode(1);
        input.next = new ListNode(2);
        boolean output = false;
        SolutionPalindromeLinkedList234 target = new SolutionPalindromeLinkedList234();
        boolean result = target.isPalindrome(input);
        assertEquals(output, result);
    }
}
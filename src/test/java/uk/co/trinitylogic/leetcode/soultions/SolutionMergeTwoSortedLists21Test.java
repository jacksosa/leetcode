package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;
import uk.co.trinitylogic.leetcode.soultions.models.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionMergeTwoSortedLists21Test {

    @Test
    void mergeTwoLists_Example_1() {
        ListNode input1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode input2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode output = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));
        SolutionMergeTwoSortedLists21 target = new SolutionMergeTwoSortedLists21();
        ListNode result = target.mergeTwoLists(input1, input2);
        assertEquals(output.toString(), result.toString());
    }

    @Test
    void mergeTwoLists_Example_2() {
        ListNode input1 = null;
        ListNode input2 = null;
        ListNode output = null;
        SolutionMergeTwoSortedLists21 target = new SolutionMergeTwoSortedLists21();
        ListNode result = target.mergeTwoLists(input1, input2);
        assertEquals(output, result);
    }

    @Test
    void mergeTwoLists_Example_3() {
        ListNode input1 = null;
        ListNode input2 = new ListNode(0);
        ListNode output = new ListNode(0);
        SolutionMergeTwoSortedLists21 target = new SolutionMergeTwoSortedLists21();
        ListNode result = target.mergeTwoLists(input1, input2);
        assertEquals(output.toString(), result.toString());
    }
}
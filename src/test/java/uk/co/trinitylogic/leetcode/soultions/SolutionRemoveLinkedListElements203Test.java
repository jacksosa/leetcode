package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;
import uk.co.trinitylogic.leetcode.soultions.models.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SolutionRemoveLinkedListElements203Test {

    @Test
    void removeElements_Example_1() {

        ListNode input1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        input1.next = node2;
        ListNode node3 = new ListNode(6);
        node2.next = node3;
        ListNode node4 = new ListNode(3);
        node3.next = node4;
        ListNode node5 = new ListNode(4);
        node4.next = node5;
        ListNode node6 = new ListNode(5);
        node5.next = node6;
        node6.next = new ListNode(6);

        int input2 = 6;

        ListNode output = new ListNode(1);
        ListNode node2o = new ListNode(2);
        output.next = node2o;
        ListNode node3o = new ListNode(3);
        node2o.next = node3o;
        ListNode node4o = new ListNode(4);
        node3o.next = node4o;
        node4o.next = new ListNode(5);

        SolutionRemoveLinkedListElements203 target = new SolutionRemoveLinkedListElements203();
        ListNode result = target.removeElements(input1, input2);
        assertEquals(output.toString(), result.toString());
    }

    @Test
    void removeElements_Example_2() {

        ListNode input1 = null;
        int input2 = 1;

        SolutionRemoveLinkedListElements203 target = new SolutionRemoveLinkedListElements203();
        ListNode result = target.removeElements(input1, input2);
        assertNull(result);
    }

    @Test
    void removeElements_Example_3() {

        ListNode input1 = new ListNode(7);
        ListNode node2 = new ListNode(7);
        input1.next = node2;
        ListNode node3 = new ListNode(7);
        node2.next = node3;
        ListNode node4 = new ListNode(7);
        node3.next = node4;
        ListNode node5 = new ListNode(7);
        node4.next = node5;
        ListNode node6 = new ListNode(7);
        node5.next = node6;
        node6.next = new ListNode(7);

        int input2 = 7;

        SolutionRemoveLinkedListElements203 target = new SolutionRemoveLinkedListElements203();
        ListNode result = target.removeElements(input1, input2);
        assertNull(result);
    }
}
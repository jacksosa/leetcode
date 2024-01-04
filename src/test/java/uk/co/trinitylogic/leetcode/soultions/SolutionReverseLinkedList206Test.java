package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;
import uk.co.trinitylogic.leetcode.soultions.models.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SolutionReverseLinkedList206Test {

    @Test
    void reverseList_Example_1() {
        ListNode input1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        input1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        node4.next = new ListNode(5);

        ListNode output = new ListNode(5);
        ListNode node2o = new ListNode(4);
        output.next = node2o;
        ListNode node3o = new ListNode(3);
        node2o.next = node3o;
        ListNode node4o = new ListNode(2);
        node3o.next = node4o;
        node4o.next = new ListNode(1);

        SolutionReverseLinkedList206 target = new SolutionReverseLinkedList206();
        ListNode result = target.reverseList(input1);
        assertEquals(output.toString(), result.toString());
    }

    @Test
    void reverseList_Example_2() {
        ListNode input1 = new ListNode(1);
        input1.next = new ListNode(2);

        ListNode output = new ListNode(2);
        output.next = new ListNode(1);

        SolutionReverseLinkedList206 target = new SolutionReverseLinkedList206();
        ListNode result = target.reverseList(input1);
        assertEquals(output.toString(), result.toString());
    }

    @Test
    void reverseList_Example_3() {
        SolutionReverseLinkedList206 target = new SolutionReverseLinkedList206();
        ListNode result = target.reverseList(null);
        assertNull(result);
    }
}
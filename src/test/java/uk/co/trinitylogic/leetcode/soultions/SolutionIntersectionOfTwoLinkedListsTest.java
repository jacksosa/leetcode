package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;
import uk.co.trinitylogic.leetcode.soultions.models.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SolutionIntersectionOfTwoLinkedListsTest {

    @Test
    void getIntersectionNode_Example_1() {
        ListNode listA = new ListNode(4);
        ListNode nodeA1 = new ListNode(1);
        ListNode listB = new ListNode(5);
        ListNode nodeB6 = new ListNode(6);
        ListNode nodeB1 = new ListNode(1);
        ListNode node8 = new ListNode(8);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        listA.next = nodeA1;
        nodeA1.next = node8;
        node8.next = node4;
        node4.next = node5;
        listB.next = nodeB6;
        nodeB6.next = nodeB1;
        nodeB1.next = node8;
        // Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
        // From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5].
        // There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
        // Note that the intersected node's value is not 1 because the nodes with value 1 in A and B
        // (2nd node in A and 3rd node in B) are different node references.
        // In other words, they point to two different locations in memory, while the nodes with value 8 in
        // A and B (3rd node in A and 4th node in B) point to the same location in memory.
        SolutionIntersectionOfTwoLinkedLists target = new SolutionIntersectionOfTwoLinkedLists();
        ListNode result = target.getIntersectionNode(listA, listB);
        assertEquals(node8, result);
    }

    @Test
    void getIntersectionNode_Example_2() {
        ListNode listA = new ListNode(2);
        ListNode nodeA6 = new ListNode(6);
        ListNode nodeA4 = new ListNode(4);
        ListNode listB = new ListNode(1);
        ListNode nodeB5 = new ListNode(5);
        listA.next = nodeA6;
        nodeA6.next = nodeA4;
        listB.next = nodeB5;
        SolutionIntersectionOfTwoLinkedLists target = new SolutionIntersectionOfTwoLinkedLists();
        ListNode result = target.getIntersectionNode(listA, listB);
        assertNull(result);
    }

    @Test
    void getIntersectionNode_Example_3() {
        ListNode listA = new ListNode(1);
        SolutionIntersectionOfTwoLinkedLists target = new SolutionIntersectionOfTwoLinkedLists();
        ListNode result = target.getIntersectionNode(listA, null);
        assertNull(result);
    }

    @Test
    void getIntersectionNode_Example_4() {
        ListNode node1 = new ListNode(1);
        SolutionIntersectionOfTwoLinkedLists target = new SolutionIntersectionOfTwoLinkedLists();
        ListNode result = target.getIntersectionNode(node1, node1);
        assertEquals(node1, result);
    }
}
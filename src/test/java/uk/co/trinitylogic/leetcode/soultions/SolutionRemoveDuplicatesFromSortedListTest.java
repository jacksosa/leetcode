package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;
import uk.co.trinitylogic.leetcode.soultions.models.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SolutionRemoveDuplicatesFromSortedListTest {

    @Test
    void deleteDuplicates_Example_1() {

        ListNode input = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);

        input.next = node1;
        node1.next = node2;

        String output = "1 : 2";

        SolutionRemoveDuplicatesFromSortedList target = new SolutionRemoveDuplicatesFromSortedList();
        ListNode result = target.deleteDuplicates(input);
        assertEquals(output, result.toString());
    }

    @Test
    void deleteDuplicates_Example_2() {

        ListNode input = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);

        input.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        String output = "1 : 2 : 3";

        SolutionRemoveDuplicatesFromSortedList target = new SolutionRemoveDuplicatesFromSortedList();
        ListNode result = target.deleteDuplicates(input);
        assertEquals(output, result.toString());
    }

    @Test
    void deleteDuplicates_Example_3() {
        SolutionRemoveDuplicatesFromSortedList target = new SolutionRemoveDuplicatesFromSortedList();
        ListNode result = target.deleteDuplicates(null);
        assertNull(result);
    }

    @Test
    void deleteDuplicates_Example_4() {

        ListNode input = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);

        input.next = node1;
        node1.next = node2;

        String output = "1";

        SolutionRemoveDuplicatesFromSortedList target = new SolutionRemoveDuplicatesFromSortedList();
        ListNode result = target.deleteDuplicates(input);
        assertEquals(output, result.toString());
    }

}
package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;
import uk.co.trinitylogic.leetcode.soultions.models.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionLinkedListCycleTest {

    @Test
    void hasCycle_Example_1() {
        ListNode node4 = new ListNode(-4);
        ListNode node0 = new ListNode(0, node4);
        ListNode node2 = new ListNode(2, node0);
        ListNode input = new ListNode(3, node2);
        node4.next = node2;
        boolean output = true;
        //Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
        SolutionLinkedListCycle target = new SolutionLinkedListCycle();
        boolean result = target.hasCycle(input);
        assertEquals(output, result);
    }

    @Test
    void hasCycle_Example_2() {
        ListNode input = new ListNode(2);
        input.next = new ListNode(1, input);
        boolean output = true;
        SolutionLinkedListCycle target = new SolutionLinkedListCycle();
        boolean result = target.hasCycle(input);
        assertEquals(output, result);
    }

    @Test
    void hasCycle_Example_3() {
        ListNode input = new ListNode(1);
        boolean output = false;
        SolutionLinkedListCycle target = new SolutionLinkedListCycle();
        boolean result = target.hasCycle(input);
        assertEquals(output, result);
    }

    @Test
    void hasCycle_Example_4() {
        ListNode input = null;
        boolean output = false;
        SolutionLinkedListCycle target = new SolutionLinkedListCycle();
        boolean result = target.hasCycle(input);
        assertEquals(output, result);
    }

    @Test
    void hasCycle_Example_5() {
        ListNode input = new ListNode(1, new ListNode(2));
        boolean output = false;
        SolutionLinkedListCycle target = new SolutionLinkedListCycle();
        boolean result = target.hasCycle(input);
        assertEquals(output, result);
    }

    @Test
    void hasCycle_Example_6() {
        int[] arr = {-21, 10, 17, 8, 4, 26, 5, 35, 33, -7, -16, 27, -12, 6, 29, -12, 5, 9, 20, 14, 14, 2, 13, -24, 21, 23, -21, 5};
        ListNode input = new ListNode(arr[0]);
        ListNode current = input;
        for (int i = 1; i < arr.length; i++) {
            ListNode newNode = new ListNode(arr[i]);
            current.next = newNode;
            current = newNode;
        }
        boolean output = false;
        //Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
        SolutionLinkedListCycle target = new SolutionLinkedListCycle();
        boolean result = target.hasCycle(input);
        assertEquals(output, result);
    }
}
package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SolutionImplementQueueUsingStacks232Test {

    @Test
    void testMyQueue() {
        SolutionImplementQueueUsingStacks232.MyQueue target = new SolutionImplementQueueUsingStacks232.MyQueue();
        target.push(1);
        target.push(2);
        assertEquals(1, target.peek());
        assertEquals(1, target.pop());
        assertFalse(target.empty());
    }

}
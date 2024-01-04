package uk.co.trinitylogic.leetcode.soultions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SolutionImplementStackUsingQueues225Test {

    @Test
    void testMyStack_Example_1() {
        SolutionImplementStackUsingQueues225.MyStack target = new SolutionImplementStackUsingQueues225.MyStack();
        target.push(1);
        target.push(2);
        assertEquals(2, target.top());
        assertEquals(2, target.pop());
        assertFalse(target.empty());
    }
}
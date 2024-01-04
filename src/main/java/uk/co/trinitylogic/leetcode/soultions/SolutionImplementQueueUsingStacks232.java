package uk.co.trinitylogic.leetcode.soultions;

import java.util.ArrayDeque;
import java.util.Deque;

public class SolutionImplementQueueUsingStacks232 {

    // https://leetcode.com/problems/implement-queue-using-stacks/

    private SolutionImplementQueueUsingStacks232() {
        // do nothing
    }

    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */

    static class MyQueue {

        private final Deque<Integer> queue;

        public MyQueue() {
            queue = new ArrayDeque<>();
        }

        public void push(int x) {
            queue.push(x);
        }

        public int pop() {
            return queue.removeLast();
        }

        public int peek() {
            Integer r = queue.peekLast();
            return r != null ? r : -1;
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }
}

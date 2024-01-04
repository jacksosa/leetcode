package uk.co.trinitylogic.leetcode.soultions;

import java.util.ArrayDeque;
import java.util.Deque;

public class SolutionImplementStackUsingQueues {

    /**
     * Your MyStack object will be instantiated and called as such:
     * MyStack obj = new MyStack();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.top();
     * boolean param_4 = obj.empty();
     */

    static class MyStack {

        private final Deque<Integer> queue;

        public MyStack() {
            queue = new ArrayDeque<>();
        }

        public void push(int x) {
            queue.push(x);
        }

        public int pop() {
            return queue.pop();
        }

        public int top() {
            Integer r = queue.peek();
            return r != null ? r : -1;
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }
}



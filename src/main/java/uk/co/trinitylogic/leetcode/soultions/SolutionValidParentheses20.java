package uk.co.trinitylogic.leetcode.soultions;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;

public class SolutionValidParentheses20 {

    // https://leetcode.com/problems/valid-parentheses/

    public boolean isValid(String s) {

        Map<Character, Character> lookup = Map.of('(', ')', '{', '}', '[', ']');

        Deque<Character> stack = new LinkedList<>();

        for (char value : s.toCharArray()) {
            if (lookup.containsKey(value)) {
                stack.push(lookup.get(value));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char last = stack.pop();
                if (last != value) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

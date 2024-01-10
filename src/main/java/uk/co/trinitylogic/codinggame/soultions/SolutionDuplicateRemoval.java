package uk.co.trinitylogic.codinggame.soultions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SolutionDuplicateRemoval {

    public static void main(String[] args) {

        String input = "hello how are you";
        String output = " ehlo";

        Map<Character, Integer> memo = new HashMap<>();

        for (char i : input.toCharArray()) {
            Integer count = memo.get(i);
            if (count == null) {
                memo.put(i, 1);
            } else {
                memo.put(i, ++count);
            }
        }
        String result = printMap(memo);
        if (result.equals(output)) {
            System.out.println("Success");
        } else {
            System.err.println("Fail");
            System.err.println("Given: " + result);
            System.err.println("Expected: " + output);
        }
    }

    public static String printMap(Map<Character, Integer> memo) {
        Iterator<Map.Entry<Character, Integer>> it = memo.entrySet().iterator();
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            Map.Entry<Character, Integer> pair = it.next();
            if (pair.getValue() > 1) {
                sb.append(pair.getKey());
            }
            it.remove();
        }
        return sb.toString();
    }
}

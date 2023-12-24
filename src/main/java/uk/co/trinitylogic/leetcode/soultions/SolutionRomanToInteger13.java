package uk.co.trinitylogic.leetcode.soultions;

import java.util.HashMap;
import java.util.Map;

public class SolutionRomanToInteger13 {

    // https://leetcode.com/problems/roman-to-integer/

    private static final Map<Character, Integer> romanNumberLookup;

    static {
        romanNumberLookup = new HashMap<>();
        romanNumberLookup.put('I', 1);
        romanNumberLookup.put('V', 5);
        romanNumberLookup.put('X', 10);
        romanNumberLookup.put('L', 50);
        romanNumberLookup.put('C', 100);
        romanNumberLookup.put('D', 500);
        romanNumberLookup.put('M', 1000);

        romanNumberLookup.put('1', 4);
        romanNumberLookup.put('2', 9);
        romanNumberLookup.put('3', 40);
        romanNumberLookup.put('4', 90);
        romanNumberLookup.put('5', 400);
        romanNumberLookup.put('6', 900);

    }

    public int romanToInt(String s) {

        s = s.replace("IV", "1")
                .replace("IX", "2")
                .replace("XL", "3")
                .replace("XC", "4")
                .replace("CD", "5")
                .replace("CM", "6");

        char[] values = s.toCharArray();
        int sum = 0;

        for (char symbol : values) {
            int value = romanNumberLookup.get(symbol);
            sum = sum + value;
        }
        return sum;
    }
}

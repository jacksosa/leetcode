package uk.co.trinitylogic.leetcode.soultions;

public class SolutionFindTheIndexOfTheFirstOccurrenceInString28 {

    // https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/?envType=study-plan-v2&envId=top-interview-150

    public int strStr(String haystack, String needle) {

        int l1 = haystack.length();
        int l2 = needle.length();

        if (l1 == 1) {
            return (haystack.equals(needle)) ? 0 : -1;
        }

        int index = -1;

        for (int i = 0; i <= (l1 - l2); i++) {
            String sub = haystack.substring(i, l2 + i);
            if (sub.equals(needle)) {
                index = i;
                break;
            }
        }

        return index;
    }
}

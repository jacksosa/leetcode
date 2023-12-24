package uk.co.trinitylogic.leetcode.soultions;

public class SolutionLongestCommonPrefix14 {

    // https://leetcode.com/problems/longest-common-prefix/

    public String longestCommonPrefix(String[] strs) {

        // find the smallest word
        int lengthOfSmallest = strs[0].length();
        String smallestWord = strs[0];
        String prefix = "";

        if (strs.length == 1) {
            return strs[0];
        }

        for (String str : strs) {
            if (lengthOfSmallest > str.length()) {
                lengthOfSmallest = str.length();
                smallestWord = str;
            }
        }

        char[] smallestWords = smallestWord.toCharArray();
        int sizeOfSmallestWords = smallestWords.length;
        for (int i = sizeOfSmallestWords; i > 0; i--) {
            prefix = smallestWord.substring(0, i);
            boolean startsWithFailed = false;
            for (String str : strs) {
                if (!str.startsWith(prefix)) {
                    startsWithFailed = true;
                    break;
                }
            }
            if (!startsWithFailed) {
                break;
            }
            if (i == 1) {
                prefix = "";
            }
        }

        return prefix;
    }
}

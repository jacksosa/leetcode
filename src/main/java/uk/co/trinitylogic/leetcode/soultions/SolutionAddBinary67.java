package uk.co.trinitylogic.leetcode.soultions;

public class SolutionAddBinary67 {

    // https://leetcode.com/problems/add-binary/

    // Binary addition:
    // 0 + 0 = 0
    // 0 + 1 = 1
    // 1 + 0 = 1
    // 1 + 1 = 10 (which is 0 carry 1)

    public String addBinary(String a, String b) {

        char[] as = a.toCharArray();
        char[] bs = b.toCharArray();

        int i = as.length - 1;
        int j = bs.length - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum = sum + as[i--] - '0';
            }
            if (j >= 0) {
                sum = sum + bs[j--] - '0';
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}

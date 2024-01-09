package uk.co.trinitylogic.codinggame.soultions;

import java.util.List;

public class SolutionTemperatures {

    // https://www.codingame.com/ide/puzzle/temperatures

    public int temperatures(List<Integer> temps) {
        if (temps == null || temps.isEmpty()) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int temp : temps) {
            if (Math.abs(temp) < Math.abs(min)) {
                min = temp;
            } else if (Math.abs(temp) == Math.abs(min) && (temp > 0)) {
                min = temp;
            }
        }
        return min;
    }
}

package de.henningwobken.hackerrank;

import java.util.Arrays;

public class HurdleRace {
    // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {
        return Math.max(Arrays.stream(height).max().getAsInt() - k, 0);
    }
}

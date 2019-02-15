package de.henningwobken.hackerrank;

import java.util.Arrays;

public class GetMoneySpent {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        final int min = Arrays.stream(keyboards).min().getAsInt() + Arrays.stream(drives).min().getAsInt();
        if (b < min) {
            return -1;
        } else if (b == min) {
            return min;
        }

        int max = 0;
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                int sum = keyboard + drive;
                if (sum > b) {
                    continue;
                }
                if (max < sum) {
                    max = sum;
                }
            }
        }
        return max;
    }
}

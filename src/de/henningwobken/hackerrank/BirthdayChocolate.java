package de.henningwobken.hackerrank;

import java.util.List;

public class BirthdayChocolate {
    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if((ar[i] + ar[j]) / (k * 1.0) % 1.0 == 0) {
                    pairs++;
                }
            }
        }
        return pairs;

    }
}

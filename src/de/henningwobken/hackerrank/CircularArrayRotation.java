package de.henningwobken.hackerrank;

import java.util.Arrays;

public class CircularArrayRotation {
    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int newK = k % a.length;
        int[] newA = new int[a.length];
        int newIndex = 0;
        for (int i = a.length - newK; i < a.length; i++) {
            newA[newIndex++] = a[i];
        }
        for (int i = 0; i < a.length - newK; i++) {
            newA[newIndex++] = a[i];
        }
        return Arrays.stream(queries).map(i -> newA[i]).toArray();
    }
}


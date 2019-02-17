package de.henningwobken.hackerrank;

import java.util.Arrays;

public class PermutationEquation {
    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
        final int[] indizes = new int[p.length];
        for (int i = 0; i < indizes.length; i++) {
            indizes[p[i] - 1] = i;
        }
        final int[] res = new int[p.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = indizes[indizes[i]] + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] list = {2, 3, 1};
        System.out.println(Arrays.toString(permutationEquation(list)));
    }
}

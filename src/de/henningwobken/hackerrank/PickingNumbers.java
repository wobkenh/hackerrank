package de.henningwobken.hackerrank;

import java.util.List;

public class PickingNumbers {
    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        int max = 0;
        for (int i = 1; i < 100; i++) {
            final int count = getCount(a, i);
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    public static int getCount(List<Integer> list, int a) {
        return (int) list.stream().filter(i -> i == a || i + 1 == a).count();
    }
}

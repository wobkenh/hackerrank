package de.henningwobken.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CutTheSticks {
    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
        List<Integer> lengths = new ArrayList<>();
        while (!isSameLength(arr)) {
            final int min = getMin(arr);
            lengths.add(arr.length);
            arr = Arrays.stream(arr).map(i -> i - min).filter(i -> i > 0).toArray();
        }
        lengths.add(arr.length);
        return lengths.stream().mapToInt(i -> i).toArray();
    }

    public static int getMin(int[] arr) {
        return Arrays.stream(arr).min().getAsInt();
    }

    public static boolean isSameLength(int[] arr) {
        int n = arr[0];
        return Arrays.stream(arr).noneMatch(i -> i != n);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(cutTheSticks(new int[]{5, 4, 4, 2, 2, 8})));
    }
}

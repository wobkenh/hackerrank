package de.henningwobken.hackerrank;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SockMerchant {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        return Arrays.stream(ar).boxed()
                .collect(Collectors.groupingBy(i -> i)).entrySet().stream()
                .map(entry -> entry.getValue().size() / 2).mapToInt(i -> i).sum();
    }


}

package de.henningwobken.hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class MigratoryBirds {
    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        return arr.stream()
                .collect(Collectors.groupingBy(i -> i))
                .entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().size()))
                .entrySet().stream()
                .max(Comparator.comparingInt(Map.Entry::getValue)).get().getKey();
    }

    public static void main(String[] args) {
        int[] list = {1, 4, 4, 4, 5, 3};
        System.out.println(migratoryBirds(Arrays.stream(list).boxed().collect(Collectors.toList())));
    }
}

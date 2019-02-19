package de.henningwobken.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Squares {
    // Complete the squares function below.
    static int squares(int a, int b) {
//        return (int) IntStream.range(a, b + 1).filter(i -> Math.sqrt(i) % 1 == 0).count();
        int min = (int) Math.sqrt(a);
        int count = 0;
        for (int i = min; i <= b; i++) {
            int pow = i * i;
            if (pow >= a && pow <= b) {
                count++;
            } else if (pow > b) {
                break;
            }
        }
        return count;
    }
}

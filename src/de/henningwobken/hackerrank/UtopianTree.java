package de.henningwobken.hackerrank;

import java.util.stream.IntStream;

public class UtopianTree {
    // Complete the utopianTree function below.
    static int utopianTree(int n) {
        int height = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                height += 1;
            } else {
                height *= 2;
            }
        }
        return height;
    }

}

package de.henningwobken.hackerrank;

public class ViralAdvertising {
    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
        int shared = 5;
        int liked = 0;
        for (int i = 1; i <= n; i++) {
            liked += shared / 2;
            int people = shared / 2;
            shared = people * 3;
        }
        return liked;
    }
}

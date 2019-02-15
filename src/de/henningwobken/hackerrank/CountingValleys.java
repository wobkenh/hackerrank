package de.henningwobken.hackerrank;

public class CountingValleys {
    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int count = 0;
        int altitude = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'U' && altitude == -1) {
                count++;
            }
            altitude += s.charAt(i) == 'U' ? 1 : -1;
        }
        return count;
    }
}

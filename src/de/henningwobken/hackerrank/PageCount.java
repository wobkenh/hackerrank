package de.henningwobken.hackerrank;

public class PageCount {
    static int pageCount(int n, int p) {
        int leftTurns = p / 2;
        int rightTurns = (n - p + (n % 2 == 0 ? 1 : 0)) / 2;
        return Math.min(leftTurns, rightTurns);
    }
}

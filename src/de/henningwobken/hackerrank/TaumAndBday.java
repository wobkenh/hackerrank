package de.henningwobken.hackerrank;

public class TaumAndBday {
    // Complete the taumBday function below.
    static long taumBday(final int blackCount, final int whiteCount, final int blackCostDirect, final int whiteCostDirect, final int conversionCost) {
        final long whiteCost = Math.min(whiteCostDirect, blackCostDirect + conversionCost);
        final long blackCost = Math.min(blackCostDirect, whiteCost + conversionCost);
        return blackCount * blackCost + whiteCount * whiteCost;
    }

    public static void main(final String[] args) {
        System.out.println(taumBday(10, 10, 1, 1, 1));
        System.out.println(taumBday(5, 9, 2, 3, 4));
        System.out.println(taumBday(1000000, 1000000, 1000000, 1000000, 1000000));
    }
}

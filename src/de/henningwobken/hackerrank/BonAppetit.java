package de.henningwobken.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class BonAppetit {
    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
        final double toPay = (bill.stream().mapToInt(i -> i).sum() - bill.get(k)) / 2.0;
        if (b == toPay) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println((int) (b - toPay));
        }
    }

    public static void main(String[] args) {
        final List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(10);
        list.add(2);
        list.add(9);
        bonAppetit(list, 1, 12);
    }
}

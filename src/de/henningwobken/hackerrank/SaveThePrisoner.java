package de.henningwobken.hackerrank;

public class SaveThePrisoner {
    // Complete the saveThePrisoner function below.
    static int saveThePrisoner(int n, int m, int s) {
        return ((s + ((m - 1) % n) - 1) % n) + 1;

    }

    public static void main(String[] args) {
        System.out.println(saveThePrisoner(3,7,3));
    }
}

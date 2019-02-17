package de.henningwobken.hackerrank;

import java.util.stream.IntStream;

public class BeautifulDays {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        return (int) IntStream.range(i, j + 1).filter(day -> Math.abs(day - reverseInt(day)) % k == 0).count();
    }

    static int reverseInt(int i) {
        int reverse = 0;
        while (i > 0) {
            reverse *= 10;
            reverse += i % 10;
            i /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverseInt(123));
        System.out.println(reverseInt(1001));
    }
}

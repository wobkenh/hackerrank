package de.henningwobken.hackerrank;

import java.util.Arrays;

public class AngryProfessor {
    static String angryProfessor(int k, int[] a) {
        return Arrays.stream(a).filter(i -> i <= 0).count() >= k ? "NO" : "YES";
    }
}

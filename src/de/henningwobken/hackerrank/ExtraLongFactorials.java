package de.henningwobken.hackerrank;

import java.math.BigInteger;

public class ExtraLongFactorials {
    static void extraLongFactorials(int n) {
        BigInteger res = BigInteger.ONE;
        for(int i = 1; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        System.out.println(res.toString());
    }
}

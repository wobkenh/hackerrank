package de.henningwobken.hackerrank;

public class FindDigits {
    // Complete the findDigits function below.
    static int findDigits(int n) {
        int count = 0;
        final int nOrig = n;
        do {
            final int lastDigit = n % 10;
            if (lastDigit != 0 && nOrig % lastDigit == 0) {
                count++;
            }
            n /= 10;
        } while (n != 0);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findDigits(1012));
    }
}

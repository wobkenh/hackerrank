package de.henningwobken.hackerrank;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(final String s, final long n) {
        final int rest = (int) (n % s.length());
        final String lastSubstring = s.substring(0, rest);
        final int asInString = asInString(s);
        return asInString * (n / s.length()) + asInString(lastSubstring);
    }

    static int asInString(final String s) {
        int asInString = 0;
        for (final char c : s.toCharArray()) {
            if (c == 'a') {
                asInString++;
            }
        }
        return asInString;
    }

    public static void main(final String[] args) {
        System.out.println(repeatedString("abcac", 999999999));
    }
}

package de.henningwobken.hackerrank;

public class AppendAndDelete {
    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
        int start = 0;
        int turns = 0;
        boolean mismatch = false;
        for (int i = 0; i < s.length(); i++) {
            if (i == t.length()) {
                int rest = s.length() - i;
                return getResultFromRest(rest, i);
            }
            if (s.charAt(i) != t.charAt(i)) {
                start = i;
                mismatch = true;
                break;
            }
        }
        if (!mismatch) {
            start++;
        }
        turns += s.length() - start;
        turns += t.length() - start;

        int rest = k - turns;
        return getResultFromRest(rest, start);
    }

    public static String getResultFromRest(int rest, int start) {
        if (rest < 0) {
            return "No";
        } else if (rest == 0) {
            return "Yes";
        } else {
            if (rest % 2 == 0) {
                return "Yes";
            } else if (start == 0) {
                return "Yes";
            } else if (rest - start * 2 >= 0) {
                return "Yes";
            } else {
                return "No";
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(appendAndDelete("ashley", "ash", 9));
    }
}

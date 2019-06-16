package de.henningwobken.hackerrank;

import java.util.Arrays;

public class AcmTeam {

    // Complete the acmTeam function below.
    static int[] acmTeam(final String[] topic) {
        int maxTopicsCount = 0;
        int attendeWithMaxCount = 0;
        for (int i = 0; i < topic.length; i++) {
            for (int j = i + 1; j < topic.length; j++) {
                final int mergedTopics = mergedTopicsCount(topic[i], topic[j]);
                if (mergedTopics > maxTopicsCount) {
                    maxTopicsCount = mergedTopics;
                    attendeWithMaxCount = 1;
                } else if (mergedTopics == maxTopicsCount) {
                    attendeWithMaxCount++;
                }
            }
        }
        return new int[]{maxTopicsCount, attendeWithMaxCount};
    }

    static int mergedTopicsCount(final String attende1, final String attende2) {
        int topicsCount = 0;
        for (int i = 0; i < attende1.length(); i++) {
            if (attende1.charAt(i) == '1' || attende2.charAt(i) == '1') {
                topicsCount++;
            }
        }
        return topicsCount;
    }

    public static void main(final String[] args) {
//        System.out.println(Arrays.toString(acmTeam(new String[]{"10101", "11110", "00010"})));
        System.out.println(Arrays.toString(acmTeam(new String[]{"10101", "11100", "11010", "00101"})));
    }
}

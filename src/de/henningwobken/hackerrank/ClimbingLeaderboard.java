package de.henningwobken.hackerrank;

public class ClimbingLeaderboard {
    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        final int[] result = new int[alice.length];
        final int[] ranks = new int[scores.length];
        int rank = 0;
        int last = 0;
        for (int i = 0; i < ranks.length; i++) {
            final int score = scores[i];
            if (last != score) {
                rank++;
                last = score;
            }
            ranks[i] = rank;
        }

        int startIndex = 0;

        for (int i = 0; i < alice.length; i++) {
            if (alice[i] >= scores[scores.length - 1]) {
                break;
            } else {
                startIndex++;
                result[i] = ranks[ranks.length - 1] + 1;
            }
        }

        int scoreIndex = scores.length - 1;
        int lastAliceScore = -1;
        for (int i = startIndex; i < alice.length; i++) {
            final int aliceScore = alice[i];
            if (lastAliceScore == aliceScore) {
                result[i] = result[i - 1];
                continue;
            }
            lastAliceScore = aliceScore;
            boolean found = false;
            for (int j = scoreIndex; j >= 0; j--) {
                if (aliceScore == scores[j]) {
                    result[i] = ranks[j];
                    scoreIndex = j;
                    found = true;
                    break;
                } else if (aliceScore < scores[j]) {
                    result[i] = ranks[j + 1];
                    scoreIndex = j;
                    found = true;
                    break;
                }
            }
            if (!found) {
                result[i] = 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        final int[] scores = {100, 100, 50, 40, 40, 20, 10};
        final int[] aliceScores = {5, 25, 50, 120};
        printArr(climbingLeaderboard(scores, aliceScores));
    }

    public static void printArr(int[] arr) {
        System.out.print("{");
        for (int i1 : arr) {
            System.out.print(i1 + ", ");
        }
        System.out.println("}");
    }

}

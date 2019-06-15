package de.henningwobken.hackerrank;

public class JumpingOnClouds2 {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(final int[] c) {
        int index = 0;
        int jumps = 0;
        while (index < c.length - 1) {
            int nextPosition = index + 2;
            if(index + 2 >= c.length) {
                nextPosition--;
            }
            if (c[nextPosition] == 1) {
                nextPosition--;
            }
            index = nextPosition;
            jumps++;
        }
        return jumps;
    }

    public static void main(final String[] args) {
        System.out.println(jumpingOnClouds(new int[]{0, 0, 0, 0, 1, 0}));
    }

}

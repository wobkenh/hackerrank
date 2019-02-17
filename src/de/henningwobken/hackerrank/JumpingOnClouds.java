package de.henningwobken.hackerrank;

public class JumpingOnClouds {
    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {
        int pos = 0;
        int energy = 100;
        boolean playing = true;
        while (playing) {
            pos += k;
            if (pos > c.length) {
                energy -= (1 + c[0] * 2);
                break;
            }
            energy--;
            pos %= c.length;
            energy -= c[pos] * 2;
            if (pos == 0) {
                playing = false;
            }
        }
        return energy;
    }

    public static void main(String[] args) {
        int[] list = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
        System.out.println(jumpingOnClouds(list, 3));
    }
}

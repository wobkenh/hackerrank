package de.henningwobken.hackerrank;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

@SuppressWarnings("Duplicates")
public class MagicSquareForming {
    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
        int minCost = 999;
        int[] leftoverNumbers = getLeftoverNumbers(s);
        boolean solved;
        while (!solved) {

            leftoverNumbers = getLeftoverNumbers(s);
            if (leftoverNumbers.length)
        }
    }

    boolean isMagicNumbers(int[][] s) {
        return getVertical(s, 0) == 15 && getVertical(s, 1) == 15 && getVertical(s, 2) == 15 &&
                getHorizontal(s, 0) == 15 && getHorizontal(s, 1) == 15 && getHorizontal(s, 2) == 15 &&
                getDiagonalUp(s) == 15 && getDiagonalDown(s) == 15;
    }

    static int[] getLeftoverNumbers(int[][] s) {
        int[] numbers = IntStream.range(1, 9).toArray();
        int count = 0;
        for (int y = 0; y < s.length; y++) {
            for (int x = 0; x < s.length; x++) {
                numbers[s[y][x]] = 0;
            }
        }
        return Arrays.stream(numbers).filter(i -> i == 0).toArray();
    }

    static int getVertical(int[][] s, int col) {
        int sum = 0;
        sum += s[0][col];
        sum += s[1][col];
        sum += s[2][col];
        return sum;
    }

    static int getHorizontal(int[][] s, int row) {
        int sum = 0;
        sum += s[row][0];
        sum += s[row][1];
        sum += s[row][2];
        return sum;
    }

    static int getDiagonalUp(int[][] s) {
        int sum = 0;
        sum += s[2][0];
        sum += s[1][1];
        sum += s[0][2];
        return sum;
    }

    static int getDiagonalDown(int[][] s) {
        int sum = 0;
        sum += s[0][0];
        sum += s[1][1];
        sum += s[2][2];
        return sum;
    }


    public static void main(String[] args) throws IOException {
        final Scanner scanner = new Scanner(new File("/home/henning/dev/hackerrank/files/magic-square-forming/test"));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        System.out.println(result);

        scanner.close();
    }
}

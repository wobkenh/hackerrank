package de.henningwobken.hackerrank;

public class MagicSquare {


    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
        int[][][] magicSquares = {
                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}}
        };
        int min = 999;
        for (int i = 0; i < magicSquares.length; i++) {
            final int cost = getCost(magicSquares[i], s);
            if (cost < min) {
                min = cost;
            }
        }
        return min;
    }

    public static int getCost(int[][] a, int[][] b) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum += Math.abs(a[i][j] - b[i][j]);
            }
        }
        return sum;
    }


    public static void main(String[] args) {
//        for (int i = 0; i <= 9; i++) {
//            for (int j = 0; j <= 9; j++) {
//                for (int k = 0; k <= 9; k++) {
//                    if (i + j + k == 15 && i != k && k != j) {
//                        System.out.println("{" + i + "," + j + "," + k + "},");
//                    }
//                }
//            }
//        }

        final int[][] arr = {
                {0, 6, 9},
                {0, 7, 8},
                {0, 8, 7},
                {0, 9, 6},
                {1, 5, 9},
                {1, 6, 8},
                {1, 8, 6},
                {1, 9, 5},
                {2, 4, 9},
                {2, 5, 8},
                {2, 6, 7},
                {2, 7, 6},
                {2, 8, 5},
                {2, 9, 4},
                {3, 3, 9},
                {3, 4, 8},
                {3, 5, 7},
                {3, 7, 5},
                {3, 8, 4},
                {4, 2, 9},
                {4, 3, 8},
                {4, 4, 7},
                {4, 5, 6},
                {4, 6, 5},
                {4, 8, 3},
                {4, 9, 2},
                {5, 1, 9},
                {5, 2, 8},
                {5, 3, 7},
                {5, 4, 6},
                {5, 6, 4},
                {5, 7, 3},
                {5, 8, 2},
                {5, 9, 1},
                {6, 0, 9},
                {6, 1, 8},
                {6, 2, 7},
                {6, 4, 5},
                {6, 5, 4},
                {6, 6, 3},
                {6, 7, 2},
                {6, 8, 1},
                {6, 9, 0},
                {7, 0, 8},
                {7, 2, 6},
                {7, 3, 5},
                {7, 5, 3},
                {7, 6, 2},
                {7, 7, 1},
                {7, 8, 0},
                {8, 0, 7},
                {8, 1, 6},
                {8, 2, 5},
                {8, 3, 4},
                {8, 4, 3},
                {8, 5, 2},
                {8, 6, 1},
                {8, 7, 0},
                {9, 0, 6},
                {9, 1, 5},
                {9, 2, 4},
                {9, 4, 2},
                {9, 5, 1},
                {9, 6, 0}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (i == j || k == j || i == k) {
                        continue;
                    }
                    if (isMagicSquare(arr[i], arr[j], arr[k])) {
                        System.out.println("{" + arrToString(arr[i]) + arrToString(arr[j]) + arrToString(arr[k]) + "}");
                    }
                }
            }
        }
    }

    public static String arrToString(int[] a) {
        return "{" + a[0] + "," + a[1] + "," + a[2] + "},";
    }

    public static boolean isMagicSquare(int[] a, int[] b, int[] c) {
        if (a[0] + b[0] + c[0] != 15) {
            return false;
        }
        if (a[1] + b[1] + c[1] != 15) {
            return false;
        }
        if (a[2] + b[2] + c[2] != 15) {
            return false;
        }
        if (a[0] + b[1] + c[2] != 15) {
            return false;
        }
        if (a[2] + b[1] + c[0] != 15) {
            return false;
        }
        boolean[] unique = new boolean[9];
        for (int i = 0; i < a.length; i++) {
            unique[a[i] - 1] = true;
            unique[b[i] - 1] = true;
            unique[c[i] - 1] = true;
        }
        boolean good = true;
        for (int i = 0; i < unique.length; i++) {
            if (!unique[i]) {
                good = false;
                break;
            }
        }
        return good;
    }
}

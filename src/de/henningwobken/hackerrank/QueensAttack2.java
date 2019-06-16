package de.henningwobken.hackerrank;

public class QueensAttack2 {
    // Complete the queensAttack function below.
    static int queensAttack(final int size, final int obstacleCount, final int rowQueen, final int colQueen, final int[][] obstacles) {
        int attackableTiles = 0;
        // top
        for (int row = rowQueen - 1; row > 0; row--) {
            if (containsPosition(obstacles, row, colQueen)) {
                break;
            }
            attackableTiles++;
        }
        // top right
        for (int row = rowQueen - 1, col = colQueen + 1; row > 0 && col <= size; row--, col++) {
            if (containsPosition(obstacles, row, col)) {
                break;
            }
            attackableTiles++;
        }
        // right
        for (int col = colQueen + 1; col <= size; col++) {
            if (containsPosition(obstacles, rowQueen, col)) {
                break;
            }
            attackableTiles++;
        }
        // bottom right
        for (int row = rowQueen + 1, col = colQueen + 1; row <= size && col <= size; row++, col++) {
            if (containsPosition(obstacles, row, col)) {
                break;
            }
            attackableTiles++;
        }
        // bottom
        for (int row = rowQueen + 1; row <= size; row++) {
            if (containsPosition(obstacles, row, colQueen)) {
                break;
            }
            attackableTiles++;
        }
        // bottom left
        for (int row = rowQueen + 1, col = colQueen - 1; row <= size && col > 0; row++, col--) {
            if (containsPosition(obstacles, row, col)) {
                break;
            }
            attackableTiles++;
        }
        // left
        for (int col = colQueen - 1; col > 0; col--) {
            if (containsPosition(obstacles, rowQueen, col)) {
                break;
            }
            attackableTiles++;
        }
        // top left
        for (int row = rowQueen - 1, col = colQueen - 1; row > 0 && col > 0; row--, col--) {
            if (containsPosition(obstacles, row, col)) {
                break;
            }
            attackableTiles++;
        }
        return attackableTiles;
    }


    static boolean containsPosition(final int[][] obstacles, final int row, final int col) {
        for (int i = 0; i < obstacles.length; i++) {
            if (obstacles[i][0] == row && obstacles[i][1] == col) {
                return true;
            }
        }
        return false;
    }

    static int queensAttack2(final int size, final int obstacleCount, final int rowQueen, final int colQueen, final int[][] obstacles) {
        int stopperRowTop = 0;
        int stopperColTopRight = colQueen + Math.min(rowQueen, size - colQueen + 1);
        int stopperColRight = size + 1;
        int stopperColBottomRight = colQueen + Math.min(size - rowQueen + 1, size - colQueen + 1);
        int stopperRowBottom = size + 1;
        int stopperColBottomLeft = colQueen - Math.min(size - rowQueen + 1, colQueen);
        int stopperColLeft = 0;
        int stopperColTopLeft = colQueen - Math.min(rowQueen, colQueen);
        for (int i = 0; i < obstacles.length; i++) {
            final int row = obstacles[i][0];
            final int col = obstacles[i][1];
            if (row == rowQueen) { // Left or Right
                if (col > colQueen) { // Right
                    if (stopperColRight > col) {
                        stopperColRight = col;
                    }
                } else { // Left
                    if (stopperColLeft < col) {
                        stopperColLeft = col;
                    }
                }
            } else if (col == colQueen) { // Top or Bottom
                if (row > rowQueen) { // Bottom
                    if (stopperRowBottom > row) {
                        stopperRowBottom = row;
                    }
                } else { // Top
                    if (stopperRowTop < row) {
                        stopperRowTop = row;
                    }
                }
            } else if (Math.abs(row - rowQueen) == Math.abs(col - colQueen)) { // Top-right, Top-left, Bottom-right, Bottom-left

                if (row < rowQueen && col < colQueen) { // Top-left
                    if (col > stopperColTopLeft) {
                        stopperColTopLeft = col;
                    }
                } else if (row > rowQueen && col < colQueen) { // Bottom-left
                    if (col > stopperColBottomLeft) {
                        stopperColBottomLeft = col;
                    }
                } else if (row > rowQueen) { // Bottom-right
                    if (col < stopperColBottomRight) {
                        stopperColBottomRight = col;
                    }
                } else { // Top-right
                    if (col < stopperColTopRight) {
                        stopperColTopRight = col;
                    }
                }
            }
        }
        int attackableTiles = 0;
        // Top
        attackableTiles += rowQueen - 1 - stopperRowTop;
        // Top-right
        attackableTiles += stopperColTopRight - colQueen - 1;
        // Right
        attackableTiles += stopperColRight - colQueen - 1;
        // Bottom-right
        attackableTiles += stopperColBottomRight - colQueen - 1;
        // Bottom
        attackableTiles += stopperRowBottom - rowQueen - 1;
        // Bottom-left
        attackableTiles += colQueen - stopperColBottomLeft - 1;
        // Left
        attackableTiles += colQueen - stopperColLeft - 1;
        // Top-left
        attackableTiles += colQueen - stopperColTopLeft - 1;
        return attackableTiles;
    }

    public static void main(final String[] args) {
//        System.out.println(queensAttack2(5, 3, 4, 3, new int[][]{
//                {5, 5},
//                {4, 2},
//                {2, 3}
//        }));
        System.out.println(queensAttack(4, 0, 4, 4, new int[][]{}));
    }

}

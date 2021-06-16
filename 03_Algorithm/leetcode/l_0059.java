package leetcode;

public class l_0059 {
}

//09:16
class Solution_l_0059 {
    public int[][] generateMatrix(int n) {
        int[][] finalMatrix = new int[n][n];
        int allElement = n * n;
        int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int row = 0;
        int column = 0;
        int currentNumber = 1;
        int directionIndex = 0;
        while (currentNumber <= allElement) {
            finalMatrix[row][column] = currentNumber;
            currentNumber++;
            int nextRow = row + directions[directionIndex][0];
            int nextColumn = column + directions[directionIndex][1];
            if (nextRow < 0 || nextRow > n - 1 || nextColumn < 0 || nextColumn > n - 1 || finalMatrix[nextRow][nextColumn] != 0) {
                directionIndex = (directionIndex + 1) % 4;
            }
            row = row + directions[directionIndex][0];
            column = column + directions[directionIndex][1];
        }
        return finalMatrix;
    }
}
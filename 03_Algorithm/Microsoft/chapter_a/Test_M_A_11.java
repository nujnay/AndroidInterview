package Microsoft.chapter_a;

public class Test_M_A_11 {
    public static void main(String[] args) {
        int[][] test = new int[][]{{1, 2}, {1, 2}, {1, 2}};
    }
}

class Solution_M_A_11 {
    public void setZeroes(int[][] matrix) {
        int[] resultRow = new int[matrix.length];
        int[] resultColumn = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    resultRow[i] = 2;
                    resultColumn[j] = 2;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (resultRow[i] == 2) {
                    matrix[i][j] = 0;
                }
                if (resultColumn[j] == 2) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
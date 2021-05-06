package Microsoft.chapter_a;

public class Test_M_A_12 {
    public static void main(String[] args) {
        int[][] test = new int[][]{{1, 2}, {1, 2}, {1, 2}};
    }
}

class Solution_M_A_12 {
    // 0,0 0,2 2,2 2,0
    // 0,1 1,2 2,1 1,0

    //4 * 4
    // 0,1 1,2 3,2 2,0
    // 1,1 1,2 2,2 2,1
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix[0].length / 2; i++) {
            for (int j = i; j < matrix[0].length - 1 - i; j++) {
                int one = matrix[i][j];
                int two = matrix[j][matrix[0].length - 1 - i];
                int three = matrix[matrix[0].length - 1 - i][matrix[0].length - 1 - j];
                int four = matrix[matrix[0].length - 1 - j][i];
                matrix[i][j] = four;
                matrix[j][matrix[0].length - 1 - i] = one;
                matrix[matrix[0].length - 1 - i][matrix[0].length - 1 - j] = two;
                matrix[matrix[0].length - 1 - j][i] = three;
            }
        }
    }
}
package Microsoft.chapter_a;

public class Test_07 {
    public static void main(String[] args) {
        Solution07 solution07 = new Solution07();
        System.out.println(solution07.longestPalindrome("cbbd"));
    }
    //aba
}

class Solution07 {

    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int charsLength = chars.length;
        if (s.length() < 2) {
            return s;
        }

        boolean[][] status = new boolean[charsLength][charsLength];
        for (int i = 0; i < charsLength; i++) {
            for (int j = 0; j < charsLength; j++) {
                status[i][j] = chars[i] == chars[j];
            }
        }
        for (int i = 0; i < charsLength; i++) {
            rightRow = i;
            leftRow = i;
            checkRightTop(status, i, i);
            checkLeftBottom(status, i, i);
            if (rightRow != i || leftRow != i) {
                if (rightRow - leftRow + 1 > macLength) {
                    macLength = rightRow - leftRow + 1;
                    maxRightRow = rightRow;
                    maxLeftRow = leftRow;
                }
            }
            rightRow = i;
        }
        System.out.println(maxLeftRow + "||" + maxRightRow + 1);
        return s.substring(maxLeftRow, maxRightRow + 1);
    }

    int rightRow = 0;
    int leftRow = 0;
    int maxRightRow = 0;
    int maxLeftRow = 0;
    int macLength = 0;


    public void checkRightTop(boolean[][] status, int row, int column) {
        if (row + 1 < status.length) {
            if (column - 1 >= 0) {
                if (status[row + 1][column - 1]) {
                    rightRow = row + 1;
                    checkRightTop(status, row + 1, column - 1);
                }
            }
        }
    }

    public void checkLeftBottom(boolean[][] status, int row, int column) {
        if (column + 1 < status.length) {
            if (row - 1 >= 0) {
                if (status[row - 1][column + 1]) {
                    leftRow = row - 1;
                    checkLeftBottom(status, row - 1, column + 1);
                }
            }
        }
    }
}
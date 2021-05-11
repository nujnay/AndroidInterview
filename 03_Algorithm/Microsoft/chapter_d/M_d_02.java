package Microsoft.chapter_d;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.List;

public class M_d_02 {
    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'a', 'b', 'c'},
                {'a', 'e', 'd'},
                {'a', 'f', 'g'}};
        String[] words = new String[]{
                "eaabcdgfa"
        };
        Solution_M_d_02 solution_m_d_02 = new Solution_M_d_02();
        for (String s : solution_m_d_02.findWords(board, words)) {
            System.out.println(s);
        }
    }
}

//12: 16
class Solution_M_d_02 {
    public List<String> findWords(char[][] board, String[] words) {
        //第一排第一个 如果是 开始遍历之后的
        List<String> result = new ArrayList<>();
        for (int indexRow = 0; indexRow < board.length; indexRow++) {
            for (int indexColumn = 0; indexColumn < board[0].length; indexColumn++) {
                for (String word : words) {
                    checkAllOrientation(board, word.toCharArray(), 0, indexRow, indexColumn, result, new boolean[board.length][board[0].length]);
                }
            }
        }
        return result;
    }

    public void checkAllOrientation(char[][] board, char[] target, int index, int indexRow, int indexColumn, List<String> result, boolean[][] used) {
        if (indexRow < board.length && indexRow >= 0) {
            if (indexColumn < board[0].length && indexColumn >= 0) {
                if (!used[indexRow][indexColumn]) {
                    if (index < target.length) {
                        char now = board[indexRow][indexColumn];
                        if (target[index] == now) {
                            if (index == target.length - 1) {
                                if (!result.contains(new String(target))) {
                                    result.add(new String(target));
                                }
                                return;
                            }
                            boolean[][] usedNew = new boolean[board.length][board[0].length];
                            for (int i = 0; i < usedNew.length; i++) {
                                System.arraycopy(used[i], 0, usedNew[i], 0, usedNew[0].length);
                            }
                            usedNew[indexRow][indexColumn] = true;
                            checkAllOrientation(board, target, index + 1, indexRow + 1, indexColumn, result, usedNew);
                            checkAllOrientation(board, target, index + 1, indexRow - 1, indexColumn, result, usedNew);
                            checkAllOrientation(board, target, index + 1, indexRow, indexColumn + 1, result, usedNew);
                            checkAllOrientation(board, target, index + 1, indexRow, indexColumn - 1, result, usedNew);
                        }
                    }
                }
            }
        }
    }

    public void checkAllOrientation(char[][] board, char[] target, int index, int indexRow, int indexColumn, List<String> result, int orient) {
        if (indexRow < board.length && indexRow >= 0) {
            if (indexColumn < board[0].length && indexColumn >= 0) {
                if (index < target.length) {
                    char now = board[indexRow][indexColumn];
                    if (target[index] == now) {
                        if (index == target.length - 1) {
                            if (!result.contains(new String(target))) {
                                result.add(new String(target));
                            }
                            return;
                        }
                        // up:1 down:2 left:3 right:4
                        if (orient != 1) { //up:1
                            checkAllOrientation(board, target, index + 1, indexRow + 1, indexColumn, result, 2);//down
                        }
                        if (orient != 2) { //down:2
                            checkAllOrientation(board, target, index + 1, indexRow - 1, indexColumn, result, 1);//up
                        }
                        if (orient != 3) {//left:3
                            checkAllOrientation(board, target, index + 1, indexRow, indexColumn + 1, result, 4);//right
                        }
                        if (orient != 4) {//right:4
                            checkAllOrientation(board, target, index + 1, indexRow, indexColumn - 1, result, 3);//left
                        }
                    }
                }
            }
        }
    }

    public void checkAllHorizontalMovement(char[][] board, char[] target, int index, int indexRow,
                                           int indexColumn, List<String> result) {
        if (indexRow < board.length) {
            if (indexColumn < board[0].length) {
                if (index < target.length) {
                    char now = board[indexRow][indexColumn];
                    if (target[index] == now) {
                        if (index == target.length - 1) {
                            result.add(new String(target));
                        }
                    } else {
                        checkAllHorizontalMovement(board, target, index + 1, indexRow, indexColumn + 1, result);
                    }
                }
            }
        }
    }


    public void checkAllLongitudinalMovement(char[][] board, char[] target, int index, int indexRow,
                                             int indexColumn, List<String> result) {
        //指针向后移动
        if (indexRow < board.length) {
            if (indexColumn < board[0].length) {
                if (index < target.length) {
                    char now = board[indexRow][indexColumn];
                    if (target[index] == now) {
                        if (index == target.length - 1) {
                            result.add(new String(target));
                        }
                    } else {
                        checkAllLongitudinalMovement(board, target, index + 1, indexRow + 1, indexColumn, result);
                    }
                }
            }
        }
    }

    public void checkAllHorizontalMovementBack(char[][] board, char[] target, int index, int indexRow,
                                               int indexColumn, List<String> result) {
        //指针向后移动
        if (indexRow < board.length) {
            if (indexColumn >= 0) {
                if (index < target.length) {
                    char now = board[indexRow][indexColumn];
                    if (target[index] == now) {
                        if (index == target.length - 1) {
                            result.add(new String(target));
                        }
                    } else {
                        checkAllHorizontalMovementBack(board, target, index + 1, indexRow, indexColumn - 1, result);
                    }
                }
            }
        }
    }


    public void checkAllLongitudinalMovementBack(char[][] board, char[] target, int index, int indexRow,
                                                 int indexColumn, List<String> result) {
        //指针向后移动
        if (indexRow >= 0) {
            if (indexColumn < board[0].length) {
                if (index < target.length) {
                    char now = board[indexRow][indexColumn];
                    if (target[index] == now) {
                        if (index == target.length - 1) {
                            result.add(new String(target));
                        }
                    } else {
                        checkAllLongitudinalMovementBack(board, target, index + 1, indexRow - 1, indexColumn, result);
                    }
                }
            }
        }
    }
}
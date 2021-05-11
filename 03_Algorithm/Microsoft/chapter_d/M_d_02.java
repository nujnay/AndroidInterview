package Microsoft.chapter_d;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.List;

public class M_d_02 {
    char[][] board = new char[][]{
            {'o', 'a', 'a', 'n'},
            {'e', 't', 'a', 'e'},
            {'i', 'h', 'k', 'r'},
            {'i', 'f', 'l', 'v'}};
    String[] words = new String[]{
            "oath",
            "pea",
            "eat",
            "rain"
    };

}

//12: 16
class Solution_M_d_02 {
    public List<String> findWords(char[][] board, String[] words) {
        //第一排第一个 如果是 开始遍历之后的
        List<String> result = new ArrayList<>();
        for (int indexRow = 0; indexRow < board.length; indexRow++) {
            for (int indexColumn = 0; indexColumn < board[0].length; indexColumn++) {
                char now = board[indexRow][indexColumn];
                for (String word : words) {
                    if (word.startsWith(now + "")) {
                        //开始进入循环
                        checkAllHorizontalMovement(board, word.toCharArray(), 1, indexRow, indexColumn + 1, result);
                        checkAllLongitudinalMovement(board, word.toCharArray(), 1, indexRow + 1, indexColumn, result);
                    }
                }
            }
        }
        return result;
    }

    public void checkAllHorizontalMovement(char[][] board, char[] target, int index, int indexRow, int indexColumn, List<String> result) {
        //指针向后移动
        if (indexRow < board.length) {
            if (indexColumn < board[0].length) {
                if (index < target.length) {
                    char now = board[indexRow][indexColumn];
                    if (target[index] == now) {
                        if (index == target.length) {
                            result.add(new String(target));
                        }
                    } else {
                        checkAllHorizontalMovement(board, target, index + 1, indexRow, indexColumn + 1, result);
                    }
                }
            }
        }
    }


    public void checkAllLongitudinalMovement(char[][] board, char[] target, int index, int indexRow, int indexColumn, List<String> result) {
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
}
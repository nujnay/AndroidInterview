package Microsoft.chapter_c;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class M_c_04 {
    public static void main(String[] args) {

    }
}


class Solution_M_c_04_02 {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        return result;
    }

    class Node {
        TreeNode now;
        Node next;
        int level;
    }
}

class Solution_M_c_04_03 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        return result;
    }

    public void zigzagLevelOrder(TreeNode root, List<List<Integer>> result, int level) {
        if (root == null) {
            return;
        }
        if (level % 2 == 1) {//Odd

        }
    }
}

class Solution_M_c_04 {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        addToList(root, 0);
        for (List<Integer> list : result) {
            Collections.sort(list);
        }
        return result;
    }

    public void addToList(TreeNode now, int level) {
        if (result.size() > level) {
            result.get(level).add(now.val);
        } else {
            List<Integer> list2 = new ArrayList<>();
            list2.add(now.val);
            result.add(list2);
        }
        if (now.right != null) {
            int next = level + 1;
            addToList(now.right, next);
        }
        if (now.left != null) {
            int next = level + 1;
            addToList(now.left, next);
        }
    }
}

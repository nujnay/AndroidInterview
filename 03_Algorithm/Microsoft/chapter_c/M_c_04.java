package Microsoft.chapter_c;

import java.sql.ClientInfoStatus;
import java.util.*;

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

//15:25 简单的reverse一下就行了 14：46第三层就不对了 20分钟
class Solution_M_c_04_03 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        zigzagLevelOrder(root, result, 0);
        for (int i = 0; i < result.size(); i++) {
            if (i % 2 == 1) {//Odd from right to left
                List<Integer> list = result.get(i);
                Collections.reverse(list);
            }
        }
        return result;
    }

    public void zigzagLevelOrder(TreeNode root, List<List<Integer>> result, int level) {
        if (root == null) {
            return;
        }
        if (result.size() > level) {
            result.get(level).add(root.val);
        } else {
            List<Integer> list2 = new ArrayList<>();
            list2.add(root.val);
            result.add(list2);
        }
        zigzagLevelOrder(root.left, result, level + 1);
        zigzagLevelOrder(root.right, result, level + 1);
//        if (level % 2 == 1) {//Odd
//            zigzagLevelOrder(root.left, result, level + 1);
//            zigzagLevelOrder(root.right, result, level + 1);
//        } else {
//            zigzagLevelOrder(root.right, result, level + 1);
//            zigzagLevelOrder(root.left, result, level + 1);
//        }
    }
}

class Solution_M_c_04_04 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean left = true;
        while (!queue.isEmpty()) {
            LinkedList<Integer> levelList = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                TreeNode curNode = queue.poll();
                if (left) {
                    levelList.offerLast(curNode.val);
                } else {
                    levelList.offerFirst(curNode.val);
                }
                if (curNode.left != null) {
                    queue.offer(curNode.left);
                }
                if (curNode.right != null) {
                    queue.offer(curNode.right);
                }
            }
            result.add(new LinkedList<>(levelList));
            left = !left;
        }
        return result;
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

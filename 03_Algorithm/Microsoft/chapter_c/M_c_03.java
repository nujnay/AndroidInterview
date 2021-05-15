package Microsoft.chapter_c;

import java.util.ArrayList;
import java.util.List;

public class M_c_03 {

}

class Solution_M_c_03 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        levelOrder(root, list, 0);
        return list;
    }

    public void levelOrder(TreeNode root, List<List<Integer>> list, int level) {
        if (root == null) {
            return;
        }
        //数组长度 = 0 level 1
        // = 1 level 1
        // = 2 level 1
        if (list.size() < level + 1) {
            List<Integer> child = new ArrayList<>();
            child.add(root.val);
            list.add(level, child);
        } else {
            List<Integer> child = list.get(level);
            child.add(root.val);
        }
        levelOrder(root.left, list, level + 1);
        levelOrder(root.right, list, level + 1);
    }
}
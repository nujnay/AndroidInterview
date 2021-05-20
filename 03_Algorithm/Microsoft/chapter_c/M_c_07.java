package Microsoft.chapter_c;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class M_c_07 {
}
//10:36 10:49
class Solution_M_c_07 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //实际上只需要两个节点的根
        Deque<TreeNode> lineP = new LinkedList<>();
        addTo(root, p, lineP);
        Deque<TreeNode> lineQ = new LinkedList<>();
        addTo(root, q, lineQ);
        for (TreeNode oneP : lineP) {
            for (TreeNode oneQ : lineQ) {
                if (oneP == oneQ) {
                    return oneP;
                }
            }
        }
        return null;
    }
    //只有是跟的才放入
    public boolean addTo(TreeNode root, TreeNode p, Deque<TreeNode> line) {
        if (root == null) {
            return false;
        }
        if (root == p) {
            line.offerFirst(root);
            return true;
        }
        if (addTo(root.right, p, line)) {
            line.offerLast(root);
            return true;
        }
        if (addTo(root.left, p, line)) {
            line.offerLast(root);
            return true;
        }
        return false;
    }
}

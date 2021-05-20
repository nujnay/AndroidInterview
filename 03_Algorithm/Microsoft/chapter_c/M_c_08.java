package Microsoft.chapter_c;

import java.util.Deque;
import java.util.LinkedList;

public class M_c_08 {

}

//11:01 11:11
class Solution_M_c_08 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //实际上只需要两个节点的根
        Deque<TreeNode> lineP = new LinkedList<>();
        addOne(root, p, lineP);
        Deque<TreeNode> lineQ = new LinkedList<>();
        addOne(root, q, lineQ);
        for (TreeNode oneP : lineP) {
            for (TreeNode oneQ : lineQ) {
                if (oneP == oneQ) {
                    return oneP;
                }
            }
        }
        return null;
    }

    public boolean addOne(TreeNode root, TreeNode p, Deque<TreeNode> rootLine) {
        if (root == null) {
            return false;
        }
        if (root == p) {
            rootLine.offerFirst(root);
            return true;
        }
        if (addOne(root.left, p, rootLine)) {
            rootLine.offerFirst(root);
            return true;
        }
        if (addOne(root.right, p, rootLine)) {
            rootLine.offerFirst(root);
            return true;
        }
        return false;
    }
}
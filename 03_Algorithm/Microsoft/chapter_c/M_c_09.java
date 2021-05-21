package Microsoft.chapter_c;

import java.util.Deque;
import java.util.LinkedList;

public class M_c_09 {

}

//11:32-12:00
class Solution_M_c_09 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode treeNode = new TreeNode();
        treeNode.val = preorder[0];
        for (int i = 1; i < preorder.length; i++) {
            getIndex(inorder, preorder[i]);
        }
    }

    int getIndex(int[] order,int target) {
        for (int i = 0; i < order.length; i++) {
            if (order[i] == target) {
                return i;
            }
        }
        return 0;
    }
}
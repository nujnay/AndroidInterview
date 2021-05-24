package Microsoft.chapter_c;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class M_c_09 {
    public static void main(String[] args) {
        Solution_M_c_09_2 m_c_09_2 = new Solution_M_c_09_2();
        int[] pre = new int[]{1, 2, 3};
        int[] in = new int[]{2, 1, 3};
        m_c_09_2.buildTree(pre, in);
    }
}
//11:38-11：51
//class Solution_M_c_09_03 {
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        TreeNode treeNode = new TreeNode();
//        treeNode.val = preorder[0];
//        for (int i = 1; i < preorder.length; i++) {
//            getIndex(inorder, preorder[i]);
//        }
//    }
//
//    int getIndex(int[] order, int target) {
//        for (int i = 0; i < order.length; i++) {
//            if (order[i] == target) {
//                return i;
//            }
//        }
//        return 0;
//    }
//}

//11:32-12:00 19:06-
class Solution_M_c_09 {
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        TreeNode treeNode = new TreeNode();
//        treeNode.val = preorder[0];
//        for (int i = 1; i < preorder.length; i++) {
//            getIndex(inorder, preorder[i]);
//        }
//    }

    int getIndex(int[] order, int target) {
        for (int i = 0; i < order.length; i++) {
            if (order[i] == target) {
                return i;
            }
        }
        return 0;
    }
}

//15:10-16:21 草 前序不是层序，搞了半天
class Solution_M_c_09_2 {
    private Map<Integer, Integer> indexMap;

    public TreeNode myBuildTree(int[] preorder, int[] inorder, int preorder_left, int preorder_right, int inorder_left, int inorder_right) {
        System.out.println(preorder_left + "|" + preorder_right + "|" + inorder_left + "|" + inorder_right);
        /**
         * 前序遍历的左指针 大于 前序遍历右指针
         */
        if (preorder_left > preorder_right) {
            return null;
        }

        // 前序遍历中的第一个节点就是根节点
        int preorder_root = preorder_left;
        // 在中序遍历中定位根节点
        int inorder_root = indexMap.get(preorder[preorder_root]);

        // 先把根节点建立出来
        TreeNode root = new TreeNode(preorder[preorder_root]);
        // 得到左子树中的节点数目
        int size_left_subtree = inorder_root - inorder_left;
        // 递归地构造左子树，并连接到根节点
        // 先序遍历中「从 左边界+1 开始的 size_left_subtree」个元素就对应了中序遍历中「从 左边界 开始到 根节点定位-1」的元素
        /**
         * 左指针 = 前序遍历数组遍历当前位置的下一个
         * 右指针 = 前序遍历当前位置 + (左指针数值位置在中序遍历的位置 - 0)
         */
        root.left = myBuildTree(preorder, inorder, preorder_left + 1, preorder_left + size_left_subtree, inorder_left, inorder_root - 1);
        // 递归地构造右子树，并连接到根节点
        // 先序遍历中「从 左边界+1+左子树节点数目 开始到 右边界」的元素就对应了中序遍历中「从 根节点定位+1 到 右边界」的元素
        root.right = myBuildTree(preorder, inorder, preorder_left + size_left_subtree + 1, preorder_right, inorder_root + 1, inorder_right);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        // 构造哈希映射，帮助我们快速定位根节点
        indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }
        return myBuildTree(preorder, inorder, 0, n - 1, 0, n - 1);
    }
}
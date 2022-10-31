package Microsoft.chapter_c;



public class Test_M_c_01 {
    public static void main(String[] args) {
        TreeNode treeNode5 = new TreeNode();
        TreeNode treeNode4 = new TreeNode();
        TreeNode treeNode6 = new TreeNode();
        TreeNode treeNode7 = new TreeNode();
        treeNode5.val = 4;
        treeNode4.val = 5;
        treeNode6.val = 6;
        treeNode7.val = 7;
        treeNode6.left = treeNode4;
        treeNode6.right = treeNode7;
        treeNode5.right = treeNode6;
        Solution_M_c_01 solution_m_c_01 = new Solution_M_c_01();
        System.out.println(solution_m_c_01.isValidBST(treeNode5));
    }
}

/**
 *  5
 *   \
 *    6
 *      \
 *     4  7
 *
 */

class Solution_M_c_01 {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }


}

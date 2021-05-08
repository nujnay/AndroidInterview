package Microsoft.chapter_c;


public class Test_M_c_01 {
    public static void main(String[] args) {
        TreeNode treeNode5 = new TreeNode();
        TreeNode treeNode4 = new TreeNode();
        TreeNode treeNode6 = new TreeNode();
        TreeNode treeNode7 = new TreeNode();
        treeNode6.left = treeNode4;
        treeNode6.right = treeNode7;
        treeNode5.right = treeNode6;
        Solution_M_c_01 solution_m_c_01 = new Solution_M_c_01();
        System.out.println(solution_m_c_01.isValidBST(treeNode5));
    }
}
class Solution_M_c_01 {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode node, long lower, long upper) {
        if (node == null) {
            return true;
        }
        if (node.val <= lower || node.val >= upper) {
            return false;
        }
        return isValidBST(node.left, lower, node.val) && isValidBST(node.right, node.val, upper);
    }
}
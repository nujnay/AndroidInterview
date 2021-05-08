package Microsoft.chapter_c;


public class Test_M_c_01 {
    public static void main(String[] args) {
        TreeNode treeNode5 = new TreeNode();
        TreeNode treeNode4 = new TreeNode();
        TreeNode treeNode6 = new TreeNode();
        TreeNode treeNode7 = new TreeNode();
        treeNode5.val = 5;
        treeNode4.val = 4;
        treeNode6.val = 6;
        treeNode7.val = 7;
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

class Solution_M_c_01_02 {
    public boolean isValidBST(TreeNode root) {
        return checkLeft(root, root.val) && checkRight(root, root.val);
    }

    public boolean checkLeft(TreeNode root, int rootVal) {
        boolean allIsRight = true;
        if (root.right != null) {
            if (!checkRight(root, root.val)) {
                allIsRight = false;
            }
        }
        if (root.left != null) {
            if (root.left.val > rootVal) {
                return false;
            }
            if (checkLeft(root, root.val)) {
                allIsRight = false;
            }
        }
        return allIsRight;
    }


    public boolean checkRight(TreeNode root, int rootVal) {
        boolean allIsRight = true;
        if (root.right != null) {
            if (root.right.val < rootVal) {
                return false;
            }
            if (!checkRight(root, root.val)) {
                allIsRight = false;
            }
        }
        if (root.left != null) {
            if (checkLeft(root, root.val)) {
                allIsRight = false;
            }
        }
        return allIsRight;
    }
}
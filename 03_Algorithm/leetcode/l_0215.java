package leetcode;

import java.util.Arrays;

/**
 * Given an integer array nums and an integer k, return the kth largest element in the array.
 * <p>
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * <p>
 * <p>
 * Input: nums = [3,2,1,5,6,4], k = 2
 * Output: 5
 * Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
 * Output: 4
 */
public class l_0215 {
    public static void main(String[] args) {


    }
}

//09:49 9:52
class Solution_l_0215 {
    public int findKthLargest(int[] nums, int k) {
        //先排序在选择
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}

//9:54 存5个值的链表
//class Solution_l_0215_02 {
//    public int findKthLargest(int[] nums, int k) {
//        Solution_l_0215_02_Node solution_l_0215_02_node = new Solution_l_0215_02_Node();
//
//    }
//
//    public void recursion(Solution_l_0215_02_Node solution_l_0215_02_node, int insert, boolean biggerLast,boolean levelPlus) {
//        if (solution_l_0215_02_node.level == 4) {
//            solution_l_0215_02_node.next = null;
//            return;
//        }
//        if (biggerLast && insert >= solution_l_0215_02_node.level) {
//            Solution_l_0215_02_Node nodeInsert = new Solution_l_0215_02_Node();
//            nodeInsert.val = insert;
//            Solution_l_0215_02_Node father = solution_l_0215_02_node.father;
//            father.next = nodeInsert;
//            solution_l_0215_02_node.father = nodeInsert;
//            nodeInsert.next = solution_l_0215_02_node;
//            nodeInsert.level = solution_l_0215_02_node.level;
//            solution_l_0215_02_node.level = solution_l_0215_02_node.level + 1;
//        } else {
//            if (levelPlus) {
//                solution_l_0215_02_node.level = solution_l_0215_02_node.level + 1;
//            }
//            //向后以为
//            recursion(solution_l_0215_02_node.next, insert,)
//        }
//    }
//
//    public class Solution_l_0215_02_Node {
//        int val;
//        int level;
//        Solution_l_0215_02_Node next;
//        Solution_l_0215_02_Node father;
//    }
//
//}
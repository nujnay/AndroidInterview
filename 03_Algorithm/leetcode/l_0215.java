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
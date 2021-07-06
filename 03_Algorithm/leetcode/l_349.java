package leetcode;

import java.util.HashSet;

/**
 * @program: Inter
 * @description:
 * @author: YanJun
 * @create: 2021-07-06 16:53
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 示例 1：
 *
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2]
 * 示例 2：
 *
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[9,4]
 **/
public class l_349 {
}

class Solution_l_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int one : nums1) {
            hashSet.add(one);
        }
        int[] ints = new int[Math.max(nums1.length, nums2.length)];
        int i = 0;
        for (int one : nums2) {
            if (hashSet.contains(one)) {
                ints[i] = one;
                i++;
            }
        }
        if (i == 0) {
            return new int[0];
        } else {
            int[] result = new int[i];
            System.arraycopy(ints, 0, result, 0, i);
            return result;
        }
    }
}
package leetcode;

import java.util.HashSet;

/**
 * @program: Inter
 * @description:
 * @author: YanJun
 * @create: 2021-07-06 16:53
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 示例 1：
 * <p>
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2]
 * 示例 2：
 * <p>
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[9,4]
 **/
public class l_349 {
}

class Solution_l_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] ints = new int[Math.min(nums1.length, nums2.length)];
        int p = 0;
        for (int one : nums1) {
            for (int two : nums2) {
                if (one == two) {
                    boolean noNow = true;
                    for (int i = 0; i < p; i++) {
                        int three = ints[i];
                        if (three == one) {
                            noNow = false;
                            break;
                        }
                    }
                    if (noNow) {
                        ints[p] = one;
                        p++;
                    }
                }
            }
        }
        int[] result = new int[p];
        System.arraycopy(ints, 0, result, 0, p);
        return result;
    }
}
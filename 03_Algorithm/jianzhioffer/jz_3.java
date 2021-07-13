package jianzhioffer;

import java.util.HashSet;

/**
 * @program: Inter
 * @description:
 * @author: YanJun
 * @create: 2021-07-13 21:26
 **/
public class jz_3 {
}
class Solution_jz_3 {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int a : nums) {
            if (hashSet.contains(a)) {
                return a;
            } else {
                hashSet.add(a);
            }
        }
        return -1;
    }
}
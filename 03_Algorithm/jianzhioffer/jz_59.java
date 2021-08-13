package jianzhioffer;

import java.util.*;

/**
 * @program: Inter
 * @description:
 * @author: YanJun
 * @create: 2021-08-13 10:24
 **/
public class jz_59 {
}

class Solution_jz_59 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = nums.length;
        LinkedList<Integer> range = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (range.size() == k) {
                range.removeFirst();
                range.addLast(nums[i]);
            } else {
                range.addLast(nums[i]);
                if (range.size() != k) {
                    continue;
                }
            }
            result.add(range.stream().mapToInt(Integer -> Integer).max().getAsInt());
        }
        int[] resultInt = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultInt[i] = result.get(i);
        }
        return resultInt;
    }
}
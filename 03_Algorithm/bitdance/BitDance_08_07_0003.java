package bitdance;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: Inter
 * @description:
 * @author: YanJun
 * @create: 2021-08-07 11:36
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 **/
public class BitDance_08_07_0003 {

}

class Solution_BitDance_08_07_0003 {
    public int lengthOfLongestSubstring(String s) {
        char[] original = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int n = original.length;
        int rk = -1;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                set.remove(original[i - 1]);
            }
            while (rk + 1 < n && !set.contains(original[rk + 1])) {
                set.add(original[rk + 1]);
                rk++;
            }
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }


}
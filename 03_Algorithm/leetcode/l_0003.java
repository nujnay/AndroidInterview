package leetcode;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class l_0003 {

}

//14:07
class Solution_l_0003 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        HashMap<String, Integer> map = new HashMap<>();

        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                start = Math.max(start, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i) + "", i);
            end = Math.max(end, i - start + 1);
        }
        return end;
    }
}
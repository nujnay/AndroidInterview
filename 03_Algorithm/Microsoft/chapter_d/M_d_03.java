package Microsoft.chapter_d;

import java.lang.module.FindException;

public class M_d_03 {
}
//10:11
class Solution_M_d_03 {
    public boolean isMatch(String s, String p) {
        return isMatch(s.toCharArray(), p.toCharArray(), 0);
    }

    public boolean isMatch(char[] original, char[] pattern, int originalIndex) {
        char originalNow = original[originalIndex];
        if (isMatchPatternOne()) { //需要知道现在是第几个

        }
    }

    public boolean isMatchPatternOne() {

    }
}
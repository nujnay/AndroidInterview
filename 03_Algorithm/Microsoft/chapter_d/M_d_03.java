package Microsoft.chapter_d;

import java.lang.module.FindException;

public class M_d_03 {
}

//10:11
class Solution_M_d_03 {
    public boolean isMatch(String s, String p) {
        return isMatch(s.toCharArray(), p.toCharArray(), 0);
    }

    public boolean isMatch(char[] original, char[] pattern, int originalIndex, int patternIndex) {
        char originalNow = original[originalIndex];
        char patternNow = original[patternIndex];
        if (originalIndex == original.length - 1) {
            if (patternIndex == pattern.length - 1) {
                if (originalNow == patternNow) {
                    return true;
                }
                if (patternNow == '*') {
                    return true;
                }
                if (patternNow == '?') {
                    return true;
                }
                return false;
            }
        } else if (originalIndex >= original.length) {
            return false;
        } else if (patternIndex >= pattern.length) {
            return false;
        }

        if (patternNow == '*') {
            isMatch(original, pattern, originalIndex + 1, patternIndex);
        }
    }

}
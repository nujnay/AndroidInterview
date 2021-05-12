package Microsoft.chapter_d;

import java.lang.module.FindException;

public class M_d_03 {
    public static void main(String[] args) {
        Solution_M_d_03 solution_m_d_03 = new Solution_M_d_03();
        System.out.println(solution_m_d_03.isMatch("aa", "*"));
    }
}

//10:11-10:30 break by work
//10:42
class Solution_M_d_03 {
    public boolean isMatch(String s, String p) {
        return isMatch(s.toCharArray(), p.toCharArray(), 0, 0);
    }

    public boolean isMatch(char[] original, char[] pattern, int originalIndex, int patternIndex) {
        if (originalIndex == original.length - 1) {
            if (patternIndex == pattern.length - 1) {
                char originalNow = original[originalIndex];
                char patternNow = original[patternIndex];
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
        char originalNow = original[originalIndex];
        char patternNow = original[patternIndex];
        if (patternNow == '*') {
            return isMatch(original, pattern, originalIndex + 1, patternIndex);
        }
        if (patternNow == '?') {
            return isMatch(original, pattern, originalIndex + 1, patternIndex + 1);
        }
        if (originalNow == patternNow) {
            return isMatch(original, pattern, originalIndex + 1, patternIndex + 1);
        }
        return false;
    }

}
package Microsoft.chapter_d;

import java.lang.module.FindException;

public class M_d_03 {
    public static void main(String[] args) {
        Solution_M_d_03 solution_m_d_03 = new Solution_M_d_03();
        System.out.println(solution_m_d_03.isMatch("aa", "a") + "||" + "aa" + "=" + "a" + "]" + "false");
        System.out.println(solution_m_d_03.isMatch("aa", "*") + "||" + "aa" + "=" + "*" + "]" + "true");
        System.out.println(solution_m_d_03.isMatch("cb", "?a") + "||" + "cb" + "=" + "?a" + "]" + "false");
        System.out.println(solution_m_d_03.isMatch("adceb", "*a*b") + "||" + "adceb" + "=" + "*a*b" + "]" + "true");
        System.out.println(solution_m_d_03.isMatch("acdcb", "a*c?b") + "||" + "acdcb" + "=" + "a*c?b" + "]" + "false");
        System.out.println(solution_m_d_03.isMatch("a", "a*") + "||" + "a" + "=" + "a*" + "]" + "true");
        System.out.println(solution_m_d_03.isMatch("", "**") + "||" + "" + "=" + "**" + "]" + "true");
    }
}

//10:11-10:30 break by work
//10:42-11:15 break
//13:52-
class Solution_M_d_03 {
    public boolean isMatch(String s, String p) {
        return isMatch(s.toCharArray(), p.toCharArray(), 0, 0);
    }

    public boolean isMatch(char[] original, char[] pattern, int originalIndex, int patternIndex) {
        if (originalIndex == original.length - 1) {
            if (patternIndex == pattern.length - 1) {
                char originalNow = original[originalIndex];
                char patternNow = pattern[patternIndex];
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
            } else if (patternIndex < pattern.length - 1) {
                char originalNow = original[originalIndex];
                char patternNow = pattern[patternIndex];
                if (originalNow == patternNow) {
                    return checkLast(pattern, patternIndex + 1);
                }
                if (patternNow == '*') {
                    return checkLast(pattern, patternIndex + 1);
                }
                if (patternNow == '?') {
                    return checkLast(pattern, patternIndex + 1);
                }
                return false;
            } else if (patternIndex > pattern.length - 1) {
                return false;
            }
        }
        if (originalIndex >= original.length) {
            if (patternIndex < pattern.length) {
                return checkLast(pattern, patternIndex);
            }
            return false;
        }
        if (patternIndex >= pattern.length) {
            return false;
        }
        char originalNow = original[originalIndex];
        char patternNow = pattern[patternIndex];
        if (patternNow == '*') {
            return isMatch(original, pattern, originalIndex + 1, patternIndex)
                    || isMatch(original, pattern, originalIndex + 1, patternIndex + 1)
                    || isMatch(original, pattern, originalIndex, patternIndex + 1);
        }
        if (patternNow == '?') {
            return isMatch(original, pattern, originalIndex + 1, patternIndex + 1);
        }
        if (originalNow == patternNow) {
            return isMatch(original, pattern, originalIndex + 1, patternIndex + 1);
        }
        return false;
    }

    public boolean checkLast(char[] pattern, int patternIndex) {
        if (patternIndex == pattern.length) {
            return true;
        }
        if (pattern[patternIndex] == '*') {
            return checkLast(pattern, patternIndex + 1);
        } else {
            return false;
        }
    }
}
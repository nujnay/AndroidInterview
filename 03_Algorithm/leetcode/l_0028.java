package leetcode;

public class l_0028 {
    public static void main(String[] args) {

    }
}

/**
 * mplement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Clarification:
 *
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 *
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 *
 *  
 *
 *
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * Input: haystack = "", needle = ""
 * Output: 0
 */

//不用递归的方式 21：46 - 21:57
class Solution_l_0028_02 {
    public int strStr(String haystack, String needle) {
        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();
        if (haystackChars.length == 0 && needleChars.length == 0) {
            return 0;
        }
        for (int i = 0; i < haystackChars.length; i++) {
            boolean nowStatusIsRight = true;
            for (int j = 0; j < needleChars.length; j++) {
                //只要一个为false 全部为false
                if (i + j == haystackChars.length) {
                    nowStatusIsRight = false;
                    break;
                }
                if (haystackChars[i + j] == needleChars[j]) {
                    nowStatusIsRight = true;
                } else {
                    nowStatusIsRight = false;
                    break;
                }
            }
            if (nowStatusIsRight) {
                return i;
            }
        }
        return -1;
    }
}

//21:35 21：46 用递归的方法超时
class Solution_l_0028 {
    public int strStr(String haystack, String needle) {
        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();
        if (haystackChars.length == 0 && needleChars.length == 0) {
            return 0;
        }
        for (int i = 0; i < haystackChars.length; i++) {
            if (checkArray(i, 0, haystackChars, needleChars)) {
                return i;
            }
        }
        return -1;
    }

    public boolean checkArray(int haystackIndex, int needleIndex, char[] haystackChars, char[] needleChars) {
        if (needleIndex == needleChars.length) {
            return true;
        }
        if (haystackIndex == haystackChars.length) {
            return false;
        }
        if (haystackChars[haystackIndex] == needleChars[needleIndex]) {
            return checkArray(haystackIndex + 1, needleIndex + 1, haystackChars, needleChars);
        } else {
            return false;
        }
    }
}

class Solution_l_0028_KMP {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int n = haystack.length(), m = needle.length();
        haystack = " " + haystack;
        needle = " " + needle;
        char[] s = haystack.toCharArray();
        char[] p = haystack.toCharArray();
        int[] next = new int[m + 1];
        for (int i = 2, j = 0; i <= m; i++) {
            while (j > 0 && p[i] != p[j + 1]) {
                j = next[j];
            }
            if (p[i] == p[j + 1]) {
                j++;
            }
            next[i] = j;
        }
        for (int i = 1, j = 0; i <= n; i++) {
            while (j > 0 && s[i] != p[j + 1]) {
                j = next[j];
            }
            if (s[i] == p[j + 1]) {
                j++;
            }
            if (j == m) {
                return i - m;
            }
        }
        return -1;
    }

}
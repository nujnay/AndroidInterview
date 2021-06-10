package leetcode;

import java.util.Arrays;

public class l_0028 {
    public static void main(String[] args) {
        //abababcd
        //ababcd

        //hello
        //ll
        Solution_l_0028_KMP_mine solution_l_0028_kmp_mine = new Solution_l_0028_KMP_mine();
        System.out.println(solution_l_0028_kmp_mine.strStr("hello", "ll"));
    }
}

//13：55 14：51 15:12
class Solution_l_0028_KMP_mine {
    public int strStr(String haystack, String needle) {
        char[] haystackC = haystack.toCharArray();
        char[] needleC = needle.toCharArray();
        int[] next = new int[needleC.length];
        next[0] = 0;
        for (int i = 1; i < next.length; i++) {
            int index = 0;
            while (index < i) {
                if (checkArrayEqual(getPrefix(needleC, index + 1), getSuffix(needleC, index + 1, i))) {
                    next[i] = index + 1;
                }
                index = index + 1;
            }
        }
        System.out.println(Arrays.toString(next));
        int needleIndex = 0;
        for (int i = 0; i < haystackC.length; i++) {
            if (haystackC[i] == needleC[needleIndex]) {
                needleIndex++;
            } else {
                //如果不一样 移动上一位的数值的下一个 如果相等继续移动 知道needleIndex = 0
                if (needleIndex > 0) {
                    System.out.println("needleIndex:" + needleIndex + "||" + i);
                    needleIndex = next[needleIndex - 1] + 1;
                    if (haystackC[i] == needleC[needleIndex]) {
                        needleIndex++;
                    }
                }
            }
            if (needleIndex == needle.length() - 1) {
                return i - needleIndex + 1;
            }
        }
        return -1;
    }

    public char[] getPrefix(char[] ori, int prefixLength) {
        char[] prefix = new char[prefixLength];
        System.arraycopy(ori, 0, prefix, 0, prefixLength);
        return prefix;
    }

    public char[] getSuffix(char[] ori, int suffixLength, int oriLength) {
        char[] suffix = new char[suffixLength];
        System.arraycopy(ori, oriLength - suffixLength + 1, suffix, 0, suffixLength);
        return suffix;
    }

    public boolean checkArrayEqual(char[] prefix, char[] suffix) {
        boolean allEqual = true;
        for (int i = 0; i < prefix.length; i++) {
            if (prefix[i] != suffix[i]) {
                allEqual = false;
                break;
            }
        }
        return allEqual;
    }
}

/**
 * mplement strStr().
 * <p>
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * Clarification:
 * <p>
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 * <p>
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 * <p>
 *  
 * <p>
 * <p>
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
    public int strStr(String ss, String pp) {
        if (pp.isEmpty()) return 0;

        // 分别读取原串和匹配串的长度
        int n = ss.length(), m = pp.length();
        // 原串和匹配串前面都加空格，使其下标从 1 开始
        ss = " " + ss;
        pp = " " + pp;

        char[] s = ss.toCharArray();
        char[] p = pp.toCharArray();

        // 构建 next 数组，数组长度为匹配串的长度（next 数组是和匹配串相关的）
        int[] next = new int[m + 1];
        // 构造过程 i = 2，j = 0 开始，i 小于等于匹配串长度 【构造 i 从 2 开始】
        for (int i = 2, j = 0; i <= m; i++) {
            // 匹配不成功的话，j = next(j)
            while (j > 0 && p[i] != p[j + 1]) {
                j = next[j];
            }
            // 匹配成功的话，先让 j++
            if (p[i] == p[j + 1]) {
                j++;
            }
            // 更新 next[i]，结束本次循环，i++
            next[i] = j;
        }

        // 匹配过程，i = 1，j = 0 开始，i 小于等于原串长度 【匹配 i 从 1 开始】
        for (int i = 1, j = 0; i <= n; i++) {
            // 匹配不成功 j = next(j)
            while (j > 0 && s[i] != p[j + 1]) {
                j = next[j];
            }
            // 匹配成功的话，先让 j++，结束本次循环后 i++
            if (s[i] == p[j + 1]) {
                j++;
            }
            // 整一段匹配成功，直接返回下标
            if (j == m) {
                return i - m;
            }
        }

        return -1;
    }
}

class Solution_l_0028_KMP_2 {
    public int strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        if (m == 0) {
            return 0;
        }
        int[] pi = new int[m];
        for (int i = 1, j = 0; i < m; i++) {
            while (j > 0 && needle.charAt(i) != needle.charAt(j)) {
                j = pi[j - 1];
            }
            if (needle.charAt(i) == needle.charAt(j)) {
                j++;
            }
            pi[i] = j;
        }
        System.out.println(Arrays.toString(pi));
        for (int i = 0, j = 0; i < n; i++) {
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                j = pi[j - 1];
            }
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i - m + 1;
            }
        }
        return -1;
    }
}

//https://leetcode-cn.com/problems/implement-strstr/solution/kmp-suan-fa-xiang-jie-by-labuladong/
class KMP {
    private int[][] dp;
    private String pat;

    public KMP(String pat) {
        this.pat = pat;
        int M = pat.length();
        // dp[状态][字符] = 下个状态
        dp = new int[M][256];
        // base case
        dp[0][pat.charAt(0)] = 1;
        // 影子状态 X 初始为 0
        int X = 0;
        // 构建状态转移图（稍改的更紧凑了）
        for (int j = 1; j < M; j++) {
            for (int c = 0; c < 256; c++) {
                dp[j][c] = dp[X][c];
                dp[j][pat.charAt(j)] = j + 1;
                // 更新影子状态
                X = dp[X][pat.charAt(j)];
            }
        }
    }

    public int search(String txt) {
        int M = pat.length();
        int N = txt.length();
        // pat 的初始态为 0
        int j = 0;
        for (int i = 0; i < N; i++) {
            // 计算 pat 的下一个状态
            j = dp[j][txt.charAt(i)];
            // 到达终止态，返回结果
            if (j == M) return i - M + 1;
        }
        // 没到达终止态，匹配失败
        return -1;
    }
}

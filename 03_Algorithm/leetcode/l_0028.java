package leetcode;

public class l_0028 {
    public static void main(String[] args) {

    }
}

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
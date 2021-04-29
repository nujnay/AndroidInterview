package Microsoft;

/**
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
 *
 * The algorithm for myAtoi(string s) is as follows:
 *
 * Read in and ignore any leading whitespace.
 * Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
 * Read in next the characters until the next non-digit charcter or the end of the input is reached. The rest of the string is ignored.
 * Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
 * If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
 * Return the integer as the final result.
 * Note:
 *
 * Only the space character ' ' is considered a whitespace character.
 * Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
 *  
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/microsoft/bm6tg/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 */
public class Test_03 {
    public static void main(String[] args) {

    }



}
class Solution {
    public int myAtoi(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0) {
                if (isAlphanumeric(chars[i])) {
                    return 0;
                }
            }
        }
        try {
            Integer integer = Integer.valueOf(after);
            return integer;
        } catch (Exception e) {
            return 0;
        }
    }

    private boolean isAlphanumeric(char c) {
        if (c == 'a') {
            return true;
        }
        if (c == 'b') {
            return true;
        }
        if (c == 'c') {
            return true;
        }
        if (c == 'd') {
            return true;
        }
        if (c == 'e') {
            return true;
        }
        if (c == 'f') {
            return true;
        }
        if (c == 'g') {
            return true;
        }
        if (c == 'h') {
            return true;
        }
        if (c == 'i') {
            return true;
        }
        if (c == 'j') {
            return true;
        }
        if (c == 'k') {
            return true;
        }
        if (c == 'l') {
            return true;
        }
        if (c == 'm') {
            return true;
        }
        if (c == 'n') {
            return true;
        }
        if (c == 'o') {
            return true;
        }
        if (c == 'p') {
            return true;
        }
        if (c == 'q') {
            return true;
        }
        if (c == 'r') {
            return true;
        }
        if (c == 's') {
            return true;
        }
        if (c == 't') {
            return true;
        }
        if (c == 'u') {
            return true;
        }
        if (c == 'v') {
            return true;
        }
        if (c == 'w') {
            return true;
        }
        if (c == 'x') {
            return true;
        }
        if (c == 'y') {
            return true;
        }
        if (c == 'z') {
            return true;
        }
        return false;
    }
}
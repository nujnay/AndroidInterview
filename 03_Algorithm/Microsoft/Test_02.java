package Microsoft;

import java.util.Locale;

public class Test_02 {
    public static void main(String[] args) {
        Solution02 solution = new Solution02();
        System.out.println(solution.isPalindrome("A E a "));
    }


}

class Solution02 {
    //"A man, a plan, a canal: Panama"
    public boolean isPalindrome(String s) {
        char[] chars = s
                .replace(" ", "")
                .replace("`", "")
                .replace("`", "")
                .replace("~", "")
                .replace("!", "")
                .replace("@", "")
                .replace("#", "")
                .replace("$", "")
                .replace("%", "")
                .replace("^", "")
                .replace("&", "")
                .replace("*", "")
                .replace("(", "")
                .replace(")", "")
                .replace("_", "")
                .replace("-", "")
                .replace("=", "")
                .replace("+", "")
                .replace("{", "")
                .replace("[", "")
                .replace("}", "")
                .replace("]", "")
                .replace(":", "")
                .replace(";", "")
                .replace("'", "")
                .replace("\"", "")
                .replace("<", "")
                .replace(",", "")
                .replace(">", "")
                .replace(".", "")
                .replace("?", "")
                .replace("/", "")
                .toLowerCase()
                .toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
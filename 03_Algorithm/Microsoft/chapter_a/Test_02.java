package Microsoft.chapter_a;

public class Test_02 {
    public static void main(String[] args) {
        Solution02_02 solution = new Solution02_02();
        System.out.println(solution.isPalindrome("0P"));
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


class Solution02_02 {
    //"A man, a plan, a canal: Panama"
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int front = 0;
        int end = chars.length - 1;
        for (int i = 0; i < chars.length; i++) {
            boolean check = true;
            char frontC = toLowerCase(chars[front]);
            char endC = toLowerCase(chars[end]);
            if (isAlphanumeric(frontC)) {

            } else {
                check = false;
                front++;
            }
            if (isAlphanumeric(endC)) {

            } else {
                check = false;
                end--;
            }
            if (check && frontC != endC) {
                return false;
            } else if (check) {
                front++;
                end--;
            }
            if (front >= end) {
                break;
            }
        }
        return true;
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
        if (c == '1') {
            return true;
        }
        if (c == '2') {
            return true;
        }
        if (c == '3') {
            return true;
        }
        if (c == '4') {
            return true;
        }
        if (c == '5') {
            return true;
        }
        if (c == '6') {
            return true;
        }
        if (c == '7') {
            return true;
        }
        if (c == '8') {
            return true;
        }
        if (c == '9') {
            return true;
        }
        if (c == '0') {
            return true;
        }
        return false;
    }

    private char toLowerCase(char c) {
        if (c == 'A') {
            return 'a';
        }
        if (c == 'B') {
            return 'b';
        }
        if (c == 'C') {
            return 'c';
        }
        if (c == 'D') {
            return 'd';
        }
        if (c == 'E') {
            return 'e';
        }
        if (c == 'F') {
            return 'f';
        }
        if (c == 'G') {
            return 'g';
        }
        if (c == 'H') {
            return 'h';
        }
        if (c == 'I') {
            return 'i';
        }
        if (c == 'J') {
            return 'j';
        }
        if (c == 'K') {
            return 'k';
        }
        if (c == 'L') {
            return 'l';
        }
        if (c == 'M') {
            return 'm';
        }
        if (c == 'N') {
            return 'n';
        }
        if (c == 'O') {
            return 'o';
        }
        if (c == 'P') {
            return 'p';
        }
        if (c == 'Q') {
            return 'q';
        }
        if (c == 'R') {
            return 'r';
        }
        if (c == 'S') {
            return 's';
        }
        if (c == 'T') {
            return 't';
        }
        if (c == 'U') {
            return 'u';
        }
        if (c == 'V') {
            return 'v';
        }
        if (c == 'W') {
            return 'w';
        }
        if (c == 'X') {
            return 'x';
        }
        if (c == 'Y') {
            return 'y';
        }
        if (c == 'Z') {
            return 'z';
        }
        return c;
    }
}
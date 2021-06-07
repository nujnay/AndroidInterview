package leetcode;

public class l_0541 {
    //abcdefg
    //bacdfeg
    public static void main(String[] args) {
        Solution_l_0541 solution_l_0541 = new Solution_l_0541();
        System.out.println(solution_l_0541.reverseStr("abcd", 2));
    }
//                System.out.println("i:" + i + ":" + "a:" + a + ":" + "b:" + b + ":" + "c:" + c);

}

//09：39
class Solution_l_0541 {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            int a = i / k;
            int c = a % 2;
            int b = i % k;
            if (c == 0) {
                if (b < k / 2) {
                    if (i + k - 1 - 2 * b < chars.length) {
                        char tmp = chars[i];
                        chars[i] = chars[i + k - 1 - 2 * b];
                        chars[i + k - 1 - 2 * b] = tmp;
                        System.out.println(new String(chars));
                    }
                }
            }
        }
        return new String(chars);
    }
}
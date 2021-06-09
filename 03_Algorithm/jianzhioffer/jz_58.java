package jianzhioffer;

public class jz_58 {
    //lrloseumgh 6
    //umghlrlose
    public static void main(String[] args) {
        Solution_jz_58 solution_jz_58 = new Solution_jz_58();
        solution_jz_58.reverseLeftWords("lrloseumgh", 6);
    }
}

//最直观的方法 9：59
class Solution_jz_58 {
    public String reverseLeftWords(String s, int n) {
        char[] ori = s.toCharArray();
        char[] tmp = new char[n];
        char[] finalC = new char[ori.length];
        System.arraycopy(ori, 0, tmp, 0, n);
        System.arraycopy(ori, n, finalC, 0, ori.length - n);
        System.arraycopy(tmp, 0, finalC, ori.length - n, n);
        return new String(finalC);
    }
}
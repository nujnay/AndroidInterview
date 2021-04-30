package Microsoft;

public class Test_05 {
    public static void main(String[] args) {
        Solution05 solution05 = new Solution05();
        solution05.reverseWords(new char[]{'1', '2', '3'});

    }
}

class Solution05 {
    public void reverseWords(char[] s) {
        //有个地方存
        Node[] resultNode = new Node[s.length];
        Node tmp = new Node();
        int nodeIndex = 0;
        boolean isSpaceLast = false;
        for (int i = s.length - 1; i >= 0; i--) {
            if (i == s.length - 1) {
                tmp = new Node();
                tmp.value = s[s.length - 1];
                tmp.high = 1;
                continue;
            }
            if (s[s.length - 1] == ' ') {
                resultNode[nodeIndex] = tmp;
                nodeIndex++;
                isSpaceLast = true;
            } else {
                if (isSpaceLast) {
                    isSpaceLast = false;
                    tmp = new Node();
                    tmp.value = s[s.length - 1];
                    tmp.high = 1;
                } else {
                    Node current = new Node();
                    current.value = s[s.length - 1];
                    current.high = tmp.high++;
                    current.father = tmp;
                    tmp = current;
                }
            }
        }

    }

    class Node {
        Node father;
        char value;
        int high;
    }
}
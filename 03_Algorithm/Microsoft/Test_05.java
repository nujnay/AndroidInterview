package Microsoft;

public class Test_05 {
    public static void main(String[] args) {
        Solution05 solution05 = new Solution05();
        char[] result = new char[]{'a', ' ', 'b'};
        solution05.reverseWords(result);
        for (char a : result) {
            System.out.println(a);
        }
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
                continue;
            }
            if (s[i] == ' ') {
                resultNode[nodeIndex] = tmp;
                nodeIndex++;
                isSpaceLast = true;
            } else {
                if (isSpaceLast) {
                    isSpaceLast = false;
                    tmp = new Node();
                    tmp.value = s[i];
                    if (i == 0) {
                        resultNode[nodeIndex] = tmp;
                    }
                } else {
                    Node current = new Node();
                    current.value = s[i];
                    current.father = tmp;
                    tmp = current;
                    if (i == 0) {
                        resultNode[nodeIndex] = tmp;
                    }
                }
            }
        }
        int index = 0;
        for (int i = 0; i < resultNode.length; i++) {
            if (resultNode[i] != null) {
                Node now = resultNode[i];
                do {
                    s[index] = now.value;
                    index++;
                    now = now.father;
                } while (now != null);
                if (index < s.length) {
                    s[index] = ' ';
                    index++;
                }
            }
        }
    }

    class Node {
        Node father;
        char value;
    }
}

//两次翻转
class Solution05_02 {
    public void reverseWords(char[] s) {

    }
}
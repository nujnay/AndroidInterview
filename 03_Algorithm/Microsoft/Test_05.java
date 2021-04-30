package Microsoft;

public class Test_05 {
    public static void main(String[] args) {
        Solution05 solution05 = new Solution05();
        char[] result = new char[]{'t', 'h', 'e', ' ', 's', 'k', 'y', ' ', 'i', 's', ' ', 'b', 'l', 'u', 'e'};
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
        char[] result = new char[s.length];
        int index = 0;
        for (int i = 0; i < resultNode.length; i++) {
            if (resultNode[i] != null) {
                Node now = resultNode[i];
                do {
                    result[index] = now.value;
                    index++;
                    now = now.father;
                } while (now != null);
                if (index < s.length) {
                    result[index] = ' ';
                    index++;
                }
            }
        }
        s = result;
    }

    class Node {
        Node father;
        char value;
    }
}
package Microsoft.chapter_a;

import java.util.Arrays;

/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * <p>
 * Follow up: Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/microsoft/ba8uv/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Test_04 {
    public static void main(String[] args) {
        Solution04 solution04 = new Solution04();
        System.out.println(solution04.reverseWords("   A Apple"));
    }
}

class Solution04 {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        Node[] nodes = new Node[chars.length];
        int[] nodesHigh = new int[chars.length];
        Node currentNode = new Node();
        int nodeNumber = 0;
        boolean lastIsSpace = false;
        for (int i = 0; i < chars.length; i++) {
            if (i == 0) {
                if (chars[chars.length - 1 - i] == ' ') {
                    lastIsSpace = true;
                } else {
                    currentNode = new Node();
                    nodes[nodeNumber] = currentNode;
                    nodesHigh[nodeNumber] = 1;
                    nodeNumber++;
                    currentNode.current = chars[chars.length - 1 - i];
                }
            } else {
                if (chars[chars.length - 1 - i] == ' ') {
                    lastIsSpace = true;
                } else {
                    if (lastIsSpace) {
                        lastIsSpace = false;
                        currentNode = new Node();
                        currentNode.current = chars[chars.length - 1 - i];
                        nodes[nodeNumber] = currentNode;
                        nodesHigh[nodeNumber] = 1;
                        nodeNumber++;
                    } else {
                        Node newN = new Node();
                        newN.current = chars[chars.length - 1 - i];
                        nodesHigh[nodeNumber - 1] = nodesHigh[nodeNumber - 1] + 1;
                        currentNode.next = newN;
                        currentNode = newN;
                    }
                }
            }
        }
        char[] result = new char[chars.length];
        char[] resultTrue;
        int resultIndex = 0;
        for (int j = 0; j < nodes.length; j++) {
            if (nodes[j] != null) {
                int nowHigh = nodesHigh[j];
                char[] now = new char[nowHigh];
                Node nowN = nodes[j];
                for (int a = 0; a < nowHigh; a++) {
                    now[nowHigh - 1 - a] = nowN.current;
                    nowN = nowN.next;
                }
                if (resultIndex != 0) {
                    result[resultIndex] = ' ';
                    resultIndex++;
                }
                for (int b = 0; b < now.length; b++) {
                    result[resultIndex] = now[b];
                    resultIndex++;
                }
            }
        }
        resultTrue = Arrays.copyOf(result, resultIndex);
        return new String(resultTrue);
    }

    class Node {
        char current;
        Node next;
    }
}
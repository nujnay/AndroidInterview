package Microsoft;

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

}

class Solution04 {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        Node[] nodes = new Node[chars.length];
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
                    nodeNumber++;
                    currentNode.current = chars[chars.length - 1 - i];
                }
            }
            if (chars[chars.length - 1 - i] == ' ') {
                lastIsSpace = true;
            } else {
                if (lastIsSpace) {
                    lastIsSpace = false;
                    currentNode = new Node();
                    nodes[nodeNumber] = currentNode;
                    nodeNumber++;
                } else {
                    Node newN = new Node();
                    currentNode.next = newN;
                    currentNode = newN;
                }
            }
        }
        return new String(chars).trim();
    }

    class Node {
        char current;
        Node next;
    }
}
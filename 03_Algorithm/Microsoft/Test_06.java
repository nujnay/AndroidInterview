package Microsoft;

public class Test_06 {
    public static void main(String[] args) {
        Solution06 solution = new Solution06();
        System.out.println(solution.isValid("(){}}{"));
    }
}

class Solution06 {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        if (chars.length % 2 == 1) {
            return false;
        }
        Node node = new Node();
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] == '[' || chars[i] == '{' || chars[i] == '(') {
                node = addNew(i, chars[i], node);
            }
            if (chars[i] == ']' || chars[i] == '}' || chars[i] == ')') {
                if (node == null) {
                    return false;
                }
                if (!checkBracket(node.value, chars[i])) {
                    return false;
                } else {
                    node = node.father;
                }
            }
        }
        return node == null;
    }

    public Node addNew(int index, char nowChar, Node old) {
        if (index == 0) {
            Node newNode = new Node();
            newNode.value = nowChar;
            return newNode;
        }
        Node newNode = new Node();
        newNode.value = nowChar;
        newNode.father = old;
        return newNode;
    }


    class Node {
        char value;
        Node father;
    }


    public boolean checkBracket(char front, char end) {
        if (front == '[') {
            if (end != ']') {
                return false;
            } else {
                return true;
            }
        }
        if (front == '(') {
            if (end != ')') {
                return false;
            } else {
                return true;
            }
        }
        if (front == '{') {
            if (end != '}') {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}

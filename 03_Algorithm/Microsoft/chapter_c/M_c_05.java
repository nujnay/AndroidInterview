package Microsoft.chapter_c;

import java.util.LinkedList;

public class M_c_05 {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(++i);
    }
}
//14:04 14:19 十分钟这样子
class Solution_M_c_05 {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        //输入node 返回node 同级别 左边的next是右边的
        LinkedList<Node> list = new LinkedList<>();
        list.offer(root);
        Node result = root;
        while (!list.isEmpty()) {
            int size = list.size();
            LinkedList<Node> listNext = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                Node node = list.poll();
                if (list.isEmpty()) {
                    node.next = null;
                } else {
                    node.next = list.peek();
                }
                if (node.left != null) {
                    listNext.offerLast(node.left);
                }
                if (node.right != null) {
                    listNext.offerLast(node.right);
                }
            }
            list.addAll(listNext);
        }
        return result;
    }
}
package Microsoft.chapter_c;

import java.util.LinkedList;

public class M_c_06 {
}
//21:23 21：34
class Solution_M_c_06 {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        //用一个链表保存下一层需要放入的node
        LinkedList<Node> list = new LinkedList<>();
        list.add(root);
        while (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i == size - 1) {
                    Node now = list.pollFirst();
                    now.next = null;
                    if (now.left != null) {
                        list.offerLast(now.left);
                    }
                    if (now.right != null) {
                        list.offerLast(now.right);
                    }
                } else {
                    Node now = list.pollFirst();
                    now.next = list.peekFirst();
                    if (now.left != null) {
                        list.offerLast(now.left);
                    }
                    if (now.right != null) {
                        list.offerLast(now.right);
                    }
                }
            }
        }
        return root;
    }
}
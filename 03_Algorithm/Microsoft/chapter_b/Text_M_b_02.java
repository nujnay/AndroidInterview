package Microsoft.chapter_b;

import java.util.ArrayList;
import java.util.List;

public class Text_M_b_02 {
}

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 class Solution_M_b_02 {
    public boolean hasCycle(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        while (head != null) {
            for (ListNode node : nodes) {
                if (node.val == head.val) {
                    if (node.next == head.next) {
                        return true;
                    }
                }
            }
            nodes.add(head);
            head = head.next;
        }
        return false;
    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
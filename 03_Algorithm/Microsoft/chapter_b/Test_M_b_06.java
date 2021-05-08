package Microsoft.chapter_b;

public class Test_M_b_06 {
    public static void main(String[] args) {

    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode now = null;
        for (int i = 0; i < lists.length; i++) {
            now = mergeTwoLists(now, lists[i]);
        }
        return now;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode now = result;
        ListNode a = l1;
        ListNode b = l2;
        while (a != null && b != null) {
            if (a.val <= b.val) {
                now.next = a;
                a = a.next;
            } else {
                now.next = b;
                b = b.next;
            }
            now = now.next;
        }
        now.next = a == null ? b : a;
        return result.next;
    }
}
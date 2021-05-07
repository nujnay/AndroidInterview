package Microsoft.chapter_b;

public class Test_M_b_06 {
    public static void main(String[] args) {

    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode now = null;
        for (int i = 0; i < lists.length; i++) {

        }

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode now = result;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                now.next = l1;
                l1 = l1.next;
            } else {
                now.next = l2;
                l2 = l2.next;
            }
        }
        now.next = l1 == null ? l2 : l1;
        return result.next;
    }
}
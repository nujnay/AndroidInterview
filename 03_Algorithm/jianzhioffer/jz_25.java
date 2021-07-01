package jianzhioffer;


/**
 * @program: Inter
 * @description:
 * @author: YanJun
 * @create: 2021-07-01 18:06
 **/
public class jz_25 {
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
//18:07 18:24
class Solution_jz_25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode tmp = new ListNode(0);
        listNode.next = tmp;
        while (l1 != null || l2 != null) {
            ListNode newL = new ListNode(0);
            if (l1 != null && l2 != null) {
                if (l1.val > l2.val) {
                    newL.val = l2.val;
                    l2 = l2.next;
                } else {
                    newL.val = l1.val;
                    l1 = l1.next;
                }
            } else {
                newL.val = l2 == null ? l1.val : l2.val;
                l2 = l2 == null ? null : l2.next;
                l1 = l1 == null ? null : l1.next;
            }
            tmp.next = newL;
            tmp = tmp.next;
        }
        return listNode.next.next;
    }
}
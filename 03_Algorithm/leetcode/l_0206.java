package leetcode;

public class l_0206 {
    public static void main(String[] args) {

    }
}

class Solution_l_0206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return curr;
    }
}
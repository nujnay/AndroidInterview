package leetcode;


public class l_0002 {

}

//09:44-10:00
class Solution_l_0002 {
    //直接相加就行
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tmp = new ListNode(0);
        ListNode result = tmp;
        boolean needCarry = false;
        boolean isFirst = true;
        while (l1 != null || l2 != null || needCarry) {
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
            if (isFirst) {
                isFirst = false;
                if (sum > 9) {
                    needCarry = true;
                    tmp.val = sum - 10;
                } else {
                    tmp.val = sum;
                }
            } else {
                ListNode now = null;
                if (needCarry) {
                    needCarry = false;
                    if (sum + 1 > 9) {
                        needCarry = true;
                        now = new ListNode(sum + 1 - 10);
                    } else {
                        now = new ListNode(sum + 1);
                    }
                } else {
                    if (sum > 9) {
                        needCarry = true;
                        now = new ListNode(sum - 10);
                    } else {
                        now = new ListNode(sum);
                    }
                }
                tmp.next = now;
                tmp = now;
            }
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        return result;
    }

}
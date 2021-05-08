package Microsoft.chapter_b;

public class Test_M_b_07 {
    public static void main(String[] args) {

    }
}

class Solution_M_b_07 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while (headA != null) {
            ListNode tmp = headB;
            while (tmp != null) {
                if (headA.val == tmp.val) {
                    ListNode nowA = headA.next;
                    ListNode nowB = tmp.next;
                    boolean allTrue = true;
                    while (nowA != null && nowB != null) {
                        if (nowA.val != nowB.val) {
                            allTrue = false;
                            break;
                        }
                        nowA = nowA.next;
                        nowB = nowB.next;
                    }
                    if (allTrue) {
                        return headA;
                    }
                }
                tmp = tmp.next;
            }
            headA = headA.next;
        }
        return null;
    }
}
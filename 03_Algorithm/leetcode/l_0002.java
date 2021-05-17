package leetcode;


public class l_0002 {

}

//09:44
class Solution_l_0002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l1Int = 0;
        int level = 0;
        while (l1 != null) {
            int now = l1.val * getLevel(level);
            level++;
            l1Int = l1Int + now;
            l1 = l1.next;
        }
        int l2Int = 0;
        int level2 = 0;
        while (l2 != null) {
            int now = l2.val * getLevel(level2);
            level2++;
            l2Int = l2Int + now;
            l2 = l2.next;
        }
    }

    public int getLevel(int level) {
        StringBuilder levelS = new StringBuilder();
        levelS.append("1");
        for (int i = 0; i < level; i++) {
            levelS.append("0");
        }
        return Integer.valueOf(levelS.toString());
    }
}
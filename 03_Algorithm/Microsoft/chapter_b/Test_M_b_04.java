package Microsoft.chapter_b;

import java.util.Stack;

public class Test_M_b_04 {
    public static void main(String[] args) {

    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }
        int carry = 0;
        ListNode result = null;
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {
            int a = stack1.isEmpty() ? 0 : stack1.pop();
            int b = stack2.isEmpty() ? 0 : stack2.pop();
            ListNode now = new ListNode(0);
            now.val = (a + b + carry) > 9 ? (a + b + carry) - 10 : (a + b + carry);
            carry = (a + b + carry) > 9 ? 1 : 0;
            now.next = result;
            result = now;
        }
        return result;
    }
}
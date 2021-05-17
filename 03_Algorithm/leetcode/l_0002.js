/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
function ListNode(val, next) {
    this.val = (val === undefined ? 0 : val)
    this.next = (next === undefined ? null : next)
}

var addTwoNumbers = function (l1, l2) {
    var tmp = new ListNode(0);
    var result = tmp;
    var needCarry = false;
    var isFirst = true;
    while (l1 != null || l2 != null || needCarry) {
        var sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
        if (isFirst) {
            isFirst = false;
            if (sum > 9) {
                needCarry = true;
                tmp.val = sum - 10;
            } else {
                tmp.val = sum;
            }
        } else {
            var now = null;
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
};
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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode p = new ListNode(-1);
        ListNode cur = head;
        head = p;
        while(cur != null && cur.next != null) {
            stack.push(cur);
            cur = cur.next;
            stack.push(cur);
            cur = cur.next;

            p.next = stack.pop();
            p = p.next;
            p.next = stack.pop();
            p = p.next;

        }
        if (cur == null) {
            p.next = null;
        } else {
            p.next = cur;
        }
        return head.next;
    }
}
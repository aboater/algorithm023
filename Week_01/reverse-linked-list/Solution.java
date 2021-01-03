/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode next = head;
        ListNode cur = null;
        while(next != null){
            ListNode t = next;
            next = next.next;
            t.next = cur;
            cur = t;
        }
        return cur;
    }
}
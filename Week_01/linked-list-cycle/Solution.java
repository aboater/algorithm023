/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode tem1 = head;
        ListNode tem2 = head;
        while(tem1 != null && tem1.next != null && tem1.next.next != null) {
            tem1 = tem1.next.next;
            tem2 = tem2.next;
            if (tem1 == tem2) {
                return true;
            }
        }
        return false;
    }
}
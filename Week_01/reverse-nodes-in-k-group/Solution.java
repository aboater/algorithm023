

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
 public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tail = head;
        for (int i = 0; i < k; i++) {
            if (tail == null) {
                return head;
            }
            tail = tail.next;
        }
        ListNode newHead = reverse(head, tail);
        head.next = reverseKGroup(head, k);
        return newHead;

    }

    public ListNode reverse(ListNode head, ListNode tail) {
        ListNode pre = null;
        ListNode next = null;
        while (head != tail) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode tail = head;
        int[] values = {1,2};
        for(int i = 0; i < values.length - 1; i++) {
            tail.val = values[i];
            tail.next = new ListNode();
            tail = tail.next;
        }
        tail.val = values[values.length - 1];
        tail = head;
        while(tail != null) {
            System.out.print(tail.val + "->");
            tail = tail.next;
        }
        System.out.println();
        head = new Solution().reverseKGroup(head, 2);
        while(head != null) {
            System.out.print(head.val);
            head = head.next;
        }
    }
}
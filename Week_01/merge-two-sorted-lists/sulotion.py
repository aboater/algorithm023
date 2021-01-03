class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        if l1 and l2:
            if l1.val > l2.val:
                l1, l2 = l2, l1
            head = l1
        else:
            if l1 is None:
                return l2
            else:
                return l1
                
        while l2:
            if l1.next is None:
                l1.next = l2
                break
            p = l1.next
            if l2.val <= p.val:
                l1.next = l2
                l2 = l2.next
                l1.next.next = p
            l1 = l1.next
        return head
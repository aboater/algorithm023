public class MyCircularDeque {
    class DequeNode {
        int value = -1;
        DequeNode pre = null;
        DequeNode next = null;
        public DequeNode() {}
        public DequeNode(int value) {
            this.value = value;
        }
    }
    private DequeNode head = null;
    private DequeNode tail  = null;
    private int capacity = 0;
    private int size = 0;
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        head = new DequeNode();
        tail = new DequeNode();
        head.next = tail;
        tail.pre = head;
        capacity = k;
        size = 0;
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        DequeNode newNode = new DequeNode(value);
        newNode.next = head.next;
        newNode.pre = head;
        head.next.pre = newNode;
        head.next = newNode;
        size++;
        return true;
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        DequeNode newNode = new DequeNode(value);
        newNode.next = tail;
        newNode.pre = tail.pre;
        tail.pre.next = newNode;
        tail.pre = newNode;
        size++;
        return true;
    }

    private void deleteNode(DequeNode node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
        size--;
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        deleteNode(head.next);
        return true;
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        deleteNode(tail.pre);
        return true;
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return head.next.value;
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return tail.pre.value;
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return size >= capacity;
    }
}

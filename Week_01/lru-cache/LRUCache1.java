import java.util.HashMap;
import java.util.Map;

public class LRUCache1 {
    class DLinkedNode {
        int key;
        int value;
        DLinkedNode prev;
        DLinkedNode next;
        public DLinkedNode() {}
        public DLinkedNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Map<Integer, DLinkedNode> cache = new HashMap<>();
    private int size;
    private int capacity;
    private DLinkedNode head;
    private DLinkedNode tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        size = 0;
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        DLinkedNode node =  cache.get(key);
        if (node == null) {
            node = new DLinkedNode();
            node.key = key;
            node.value = value;
            cache.put(key, node);
            if (size == capacity) {
                cache.remove(tail.prev.key);
                removeNode();
            }
            
            addNode(node);
        } else {
            node.value = value;
            moveToHead(node);
        }
    }

    private void moveToHead(DLinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;

        node.prev = head;
        node.next = head.next;
        
        head.next.prev = node;
        head.next = node;
    }

    private void addNode(DLinkedNode node) {
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
        size ++;
    }

    private void removeNode() {
        if (tail.prev != head) {
            tail.prev.prev.next = tail;
            tail.prev = tail.prev.prev;
            size --;
        }
    }

}
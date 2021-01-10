import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new LinkedList<>();
        Deque<Node> deque = new LinkedList<>();
        if (root == null) {
            return list;
        }
        deque.add(root);
        levelOrderTraversalNAryTree(list, deque);
        return list;
    }

    public void levelOrderTraversalNAryTree(List<List<Integer>> list, Deque<Node> deque) {
        List<Integer> inList = new LinkedList<>();
        int n = deque.size();
        for (int i=0; i < n; i++) {
            Node firstNode = deque.pollFirst();
            inList.add(firstNode.val);
            for (Node node : firstNode.children) {
                deque.addLast(node);
            }
        }
        list.add(inList);
        // 当队列为空时停止递归，不然递归不会停止
        if (deque.size() == 0) {
            return;
        }
        levelOrderTraversalNAryTree(list, deque);
    }
}

public class Solution1 {
    
}

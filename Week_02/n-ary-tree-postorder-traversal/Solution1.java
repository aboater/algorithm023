/*
// Definition for a Node.
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
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> valueList = new LinkedList<>();
        postorderTraversalNAryTree(root, valueList);
        return valueList;
    }

    public void postorderTraversalNAryTree(Node root, List<Integer> valueList) {
        if (root == null) {
            return;
        }
        if (!root.children.isEmpty()) {
             for (Node node : root.children) {
                 postorderTraversalNAryTree(node, valueList);
             }
        }
        valueList.add(root.val);
        
    }
}

public class Solution1 {
    
}

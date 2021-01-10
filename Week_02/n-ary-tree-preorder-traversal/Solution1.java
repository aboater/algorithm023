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
    public List<Integer> preorder(Node root) {

        List<Integer> valueList = new LinkedList<>();
        if (root == null) {
            return valueList;
        }
        preorderTraversalNAryTree(root, valueList);
        return valueList;
    }

    public void preorderTraversalNAryTree(Node root, List<Integer> valueList) {
        if (root == null) {
            return;
        }
        valueList.add(root.val);
        int n = root.children.size();
        for (int i = 0; i < n; i++) {
            preorderTraversalNAryTree(root.children.get(i), valueList);
        }
        
        
    }

}

public class Solution1 {
    
}

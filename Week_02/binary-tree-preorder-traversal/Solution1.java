/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> valueList = new LinkedList<>();
        preorderTraversalBinaryTree(root, valueList);
        return valueList;
    }

    public void preorderTraversalBinaryTree(TreeNode root, List<Integer> valueList) {
        if (root == null) {
            return;
        }
        valueList.add(root.val);
        if (root.left != null) {
            preorderTraversalBinaryTree(root.left, valueList);
        }
        if (root.right != null) {
            preorderTraversalBinaryTree(root.right, valueList);
        }
        
    }
}

public class Solution1 {
    
}

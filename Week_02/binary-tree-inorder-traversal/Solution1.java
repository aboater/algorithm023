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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        inorderTraversalBinaryTree(root, list);
        return list;
    }

    public void inorderTraversalBinaryTree(TreeNode root, List<Integer> valueList) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            inorderTraversalBinaryTree(root.left, valueList);
        }
        valueList.add(root.val);
        if (root.right != null) {
            inorderTraversalBinaryTree(root.right, valueList);
        }
    }
}

public class Solution1 {
    
}

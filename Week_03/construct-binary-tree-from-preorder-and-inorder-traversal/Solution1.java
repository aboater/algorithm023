import java.util.HashMap;
import java.util.Map;

class Solution {
    class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode(int x) { val = x; }
         }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preorderLength = preorder.length;
        int inorderLength = inorder.length;
        if (preorderLength != inorderLength) {
            throw Exception("");
        }
        Map<Integer, Integer> inorderMap = new HashMap<>();
        for (int i = 0; i < inorderLength; i++) {
            inorderMap.put(inorder[i], i);
        }

        return buildTree(preorder, 0, preorderLength - 1, map, 0, inorderLength - 1);

    }

    private TreeNode buildTree(int[] preorder, int preLeft, int preRight, Map<Integer, Integer> inorderMap, int inLeft, int inRight) {
        if (preLeft > preRight || inLeft > inRight) {
            return null;
        }
        int rootValue = preorder[preLeft];
        int rootIndex = inorderMap.get(rootValue);
        TreeNode root = new TreeNode(rootValue);
        root.left = buildTree(preorder, preLeft + 1, rootIndex - inLeft + preLeft, inorderMap, inLeft, rootIndex - 1);
        root.right = buildTree(preorder, rootIndex - inLeft + preLeft + 1, preRight, inorderMap, rootIndex + 1, inRight);
        return root;
    }
}
public class Solution1 {

}

package problem2.traversals;

import problem1.node.TreeNode;

import java.util.ArrayList;

public class Traversals {
    private void preOrderTraversal(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.getData());
        preOrderTraversal(root.getLeft(), result);
        preOrderTraversal(root.getRight(), result);
    }
}

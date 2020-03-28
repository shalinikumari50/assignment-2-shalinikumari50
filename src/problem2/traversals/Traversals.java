package problem2.traversals;

import problem1.node.TreeNode;

import java.util.ArrayList;

public class Traversals {
    public ArrayList<Integer> preOrderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        preOrderTraversal(root, result);
        return result;
    }
    private void preOrderTraversal(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.getData());
        preOrderTraversal(root.getLeft(), result);
        preOrderTraversal(root.getRight(), result);
    }

    private void postOrderTraversal(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.getLeft(), result);
        postOrderTraversal(root.getRight(), result);
        result.add(root.getData());
    }
}

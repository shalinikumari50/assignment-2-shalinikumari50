package problem2.checkStatements;

import problem1.node.TreeNode;

import java.util.ArrayList;

public class CheckStatements {

    private boolean checkStatement1(ArrayList<Integer> preOrderTraversal, ArrayList<Integer> postOrderTraversal, TreeNode root) {
        System.out.println("Statement : \"In pre order, root is the first element where as in post order, root is the last element.\"");
        boolean firstCondition = false;
        boolean secondCondition = false;
        if (preOrderTraversal.get(0) == root.getData()) {
            firstCondition = true;
        }
        if (postOrderTraversal.get(postOrderTraversal.size() - 1) == root.getData()) {
            secondCondition = true;
        }
        if (firstCondition && secondCondition) {
            System.out.println("Verified!!");
            return true;
        } else {
            System.out.println("Statement is wrong");
            return false;
        }
    }
}

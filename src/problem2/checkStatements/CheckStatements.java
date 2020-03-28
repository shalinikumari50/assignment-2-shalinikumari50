package problem2.checkStatements;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem2.traversals.Traversals;

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

    private boolean checkStatement2(ArrayList<Integer> preOrderTraversal, ArrayList<Integer> postOrderTraversal) {
        System.out.println("Statement : \"Both the traversal will give same element at the mid position for odd number of nodes.\"");
        int midIndex = preOrderTraversal.size() / 2;
        if (preOrderTraversal.get(midIndex).equals(postOrderTraversal.get(midIndex))) {
            System.out.println("Verified!!");
            return true;
        } else {
            System.out.println("Statement is wrong");
            return false;
        }
    }

    private boolean testCases(int[][] testCases, int statement) {
        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();
        boolean statementResult = true;
        Traversals traversals = new Traversals();
        int i = 0;
        for (int[] test : testCases) {
            i++;
            System.out.println("Test " + i + ":");
            myBinarySearchTree.createBST(test);
            TreeNode root = myBinarySearchTree.getRoot();
            if (root == null) {
                System.out.println("***************************************************");
                continue;
            }
            ArrayList<Integer> preOrderTraversal = traversals.preOrderTraversal(root);
            ArrayList<Integer> postOrderTraversal = traversals.postOrderTraversal(root);
            System.out.println("PreOrder Traversal : " + preOrderTraversal);
            System.out.println("PostOrder Traversal : " + postOrderTraversal);

            boolean checkStatement = true;
            if (statement == 1) {
                checkStatement = checkStatement1(preOrderTraversal, postOrderTraversal, root);
            } else if (statement == 2) {
                if (preOrderTraversal.size() % 2 != 0) {
                    checkStatement = checkStatement2(preOrderTraversal, postOrderTraversal);
                } else {
                    System.out.println("We need odd number of nodes!");
                }
            }
            if (!checkStatement) {
                statementResult = false;
            }
            System.out.println("***************************************************");
        }
        return statementResult;
    }

}

/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public MyBinarySearchTree() {
        this.root = null;
    }

    public void insert(int val) {
        TreeNode newNode = new TreeNode(val);
        if (root == null) {
            root = newNode;
            return;
        }
        TreeNode parent = null;
        TreeNode current = root;
        while (true) {
            parent = current;
            if (val < current.getData()) {
                current = current.getLeft();
                if (current == null) {
                    parent.setLeft(newNode);
                    return;
                }
            } else if (val > current.getData()) {
                current = current.getRight();
                if (current == null) {
                    parent.setRight(newNode);
                    return;
                }
            } else {
                System.out.println("Binary search tree can contain only unique elements");
                return;
            }
        }

    }

    public void createBST(int[] arr) {
        root = null;
        for (int value : arr) {
            insert(value);
        }
        if (arr.length != 0) {
            System.out.println("A Binary Search Tree is created!");
        } else {
            System.out.println("No nodes in tree!");
        }
    }

    public void leftChildTraversal() {
        if (root == null) {
            return;
        }
        Queue<TreeNode> myQueue = new LinkedList<>();
        myQueue.add(root);
        int NodesWithoutLeftChild = 0;
        boolean firstLeftChild = true;

        while (!myQueue.isEmpty()) {
            TreeNode current = myQueue.remove();
            if (current.getLeft() != null) {
                myQueue.add(current.getLeft());
                if (firstLeftChild) {
                    System.out.println("All the left children in the tree are as follows:");
                    firstLeftChild = false;
                }
                System.out.print(current.getLeft().getData() + " ");
            } else {
                NodesWithoutLeftChild++;
            }
            if (current.getRight() != null) {
                myQueue.add(current.getRight());
            }
        }
        if (firstLeftChild) {
            System.out.println("Oops! There are no left children in the tree!");
            System.out.println("Number of nodes without Left child = " + NodesWithoutLeftChild);
        } else {
            System.out.println("\nNumber of nodes without Left child = " + NodesWithoutLeftChild);
        }
    }


}

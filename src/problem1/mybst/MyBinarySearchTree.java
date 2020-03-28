/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

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
}

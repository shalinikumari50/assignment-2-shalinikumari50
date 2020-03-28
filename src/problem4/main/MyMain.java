/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.preOrderSuccessor.PreOrderSuccessor;
import problem5.node.Node;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();
        PreOrderSuccessor preOrderSuccessor = new PreOrderSuccessor();
        int[] nodes = {50, 44, 60, 48, 55, 70, 32, 80, 61, 29, 18, 62, 63, 64, 65, 66};
        myBinarySearchTree.createBST(nodes);

        preOrderSuccessor.preOrderTraversal(myBinarySearchTree.getRoot());
        System.out.println("Pre Order traversal: ");
        preOrderSuccessor.getMyQueue().displayQueue();
        System.out.println("PreOrder successors of all nodes: ");
        for (int node : nodes) {
            preOrderSuccessor.preOrderSuccessor(new Node<>(node));
        }
    }

}

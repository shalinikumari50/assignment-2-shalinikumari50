package problem4.preOrderSuccessor;

import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;
import problem5.node.Node;

public class PreOrderSuccessor {
    private MyQueue<Integer> myQueue;

    public PreOrderSuccessor() {
        this.myQueue = new MyQueue<>();
    }

    public MyQueue getMyQueue() {
        return myQueue;
    }

    public void preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        myQueue.enqueue(new Node<>(root.getData()));
        preOrderTraversal(root.getLeft());
        preOrderTraversal(root.getRight());
    }


}

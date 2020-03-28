/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

public class MyPriorityQueue<T> {
    private Node<T> front;

    public MyPriorityQueue() {
        front = null;
    }

    public void enqueue(Node<T> newNode) {
        if (front == null || newNode.getElement().getPriority() < front.getElement().getPriority()) {
            newNode.setNext(front);
            front = newNode;
            return;
        }
        Node<T> temp = front;
        while (temp.getNext() != null && temp.getNext().getElement().getPriority() <= newNode.getElement().getPriority()) {
            temp = temp.getNext();
        }
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty - Underflow");
        } else {
            front = front.getNext();
        }
    }
}

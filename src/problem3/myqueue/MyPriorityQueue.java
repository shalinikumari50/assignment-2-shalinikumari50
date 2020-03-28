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

    public void display() {
        if (front == null) {
            System.out.println("Queue is empty - Underflow");
        } else {
            Node temp = front;
            while (temp != null) {
                System.out.println(temp.getElement().getData().toString());
                temp = temp.getNext();

            }
            System.out.println();
        }
    }

    public void printMenu() {
        System.out.println("press\n" +
                "0 - to exit\n" +
                "1 - to insert element\n" +
                "2 - to delete element\n" +
                "3 - to display queue\n" +
                "4 - to print menu");
    }



}

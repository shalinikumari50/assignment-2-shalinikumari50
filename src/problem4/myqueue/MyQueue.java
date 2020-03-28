/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem5.node.Node;

public class MyQueue<T> {
    private Node<T> start;
    private Node<T> end;
    private int size;

    public MyQueue() {
        start = null;
        end = null;
        size = 0;
    }

    public Node<T> getStart() {
        return start;
    }

    public void setStart(Node<T> start) {
        this.start = start;
    }

    public Node<T> getEnd() {
        return end;
    }

    public void setEnd(Node<T> end) {
        this.end = end;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void enqueue(Node<T> newNode) {
        if (start == null) {
            start = newNode;
        } else {
            end.setNext(newNode);
        }
        end = newNode;
        size++;
    }

    public void dequeue() {
        if (start == null) {
            System.out.println("Queue is empty - underflow");
        } else {
            start = start.getNext();
            System.out.println("First element deleted");
            size--;
        }

    }

    public void displayQueue() {
        if (start == null) {
            System.out.println("Queue is empty - underflow");
            return;
        }
        Node temp = start;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }






}

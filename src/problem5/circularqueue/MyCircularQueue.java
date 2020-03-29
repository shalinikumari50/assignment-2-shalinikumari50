/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;

//to implement circular queue
public class MyCircularQueue<T> {
    private Node<T> start;
    private Node<T> end;
    private int size;

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

    public MyCircularQueue() {
        start = null;
        end = null;
        size = 0;
    }

    public void enqueue(Node<T> newNode) {
        if (start == null) {
            start = newNode;

        } else {
            end.setNext(newNode);

        }
        newNode.setNext(start);
        end = newNode;
        size++;
    }

    public void dequeue() {
        if (start == null) {
            System.out.println("Queue is empty - underflow");
        } else {
            start = start.getNext();
            end.setNext(start);
            System.out.println("First element deleted");
        }

    }

    public void displayQueue() {
        if (start == null) {
            System.out.println("Queue is empty - underflow");
            return;
        }
        Node temp = start;
        while (temp != end) {
            System.out.println(temp.getData().toString());
            temp = temp.getNext();
        }
        System.out.println();
    }



}

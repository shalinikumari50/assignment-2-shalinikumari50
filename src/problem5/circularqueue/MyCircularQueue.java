/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;
import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue<T> {
    private Node<T> start;
    private Node<T> end;
    private int size;

    public MyCircularQueue() {
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
            size--;
            if (size == 0) {
                start = end = null;
            }
        }

    }

    public void displayQueue() {
        if (start == null) {
            System.out.println("Queue is empty - underflow");
            return;
        }
        Node<T> temp = start;
        while (temp != end) {
            System.out.println(temp.getData().toString());
            temp = temp.getNext();
        }
        System.out.println(temp.getData().toString());
        System.out.println();
    }

    public void processQueue(MyCircularQueue<Student> myCircularQueue) {
        if (myCircularQueue.getStart() == null) {
            return;
        }
        int size = myCircularQueue.getSize();
        int iteration = 0;
        int deleted = 0;
        while (myCircularQueue.getStart() != null && iteration < 2 * size - deleted) {

            Student student = myCircularQueue.getStart().getData();

            iteration++;
            if (iteration <= size) {
                student.setBackLog(student.getBackLog() - 1);
                if (student.getBackLog() <= 0) {
                    myCircularQueue.dequeue();
                    deleted++;
                } else {
                    myCircularQueue.setStart(myCircularQueue.getStart().getNext());
                    myCircularQueue.setEnd(myCircularQueue.getEnd().getNext());
                }
            } else {
                student.setBackLog(student.getBackLog() - 2);
                if (student.getBackLog() <= 0) {
                    myCircularQueue.dequeue();

                } else {
                    myCircularQueue.setStart(myCircularQueue.getStart().getNext());
                    myCircularQueue.setEnd(myCircularQueue.getEnd().getNext());
                }
            }

        }


    }


}

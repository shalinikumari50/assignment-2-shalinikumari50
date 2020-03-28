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

    public MyCircularQueue() {
        start = null;
        end = null;
    }


}

/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.node;

import problem3.element.Element;

public class Node<T> {
    private Element<T> element;
    private Node<T> next;

    public Node(Element<T> element) {
        this.element = element;
        next = null;
    }

    public Element<T> getElement() {
        return element;
    }

    public void setElement(Element<T> element) {
        this.element = element;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}

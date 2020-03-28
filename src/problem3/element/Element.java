package problem3.element;

public class Element<T> {
    private T data;
    private int priority;

    public Element(T data, int priority) {
        this.data = data;
        this.priority = priority;
    }
}

package ds;

public class Stack<T> {
    private final LinkedList<T> items = new LinkedList<>();

    public void push(T v) { items.addFirst(v); }
    public T pop() { return items.removeFirst(); }
    public T peek() { return items.get(0); }
    public boolean isEmpty() { return items.isEmpty(); }
    public int size() { return items.size(); }
}

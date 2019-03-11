package ds;

public class Queue<T> {
    private final LinkedList<T> items = new LinkedList<>();

    public void enqueue(T v) { items.add(v); }
    public T dequeue() { return items.removeFirst(); }
    public boolean isEmpty() { return items.isEmpty(); }
    public int size() { return items.size(); }
}

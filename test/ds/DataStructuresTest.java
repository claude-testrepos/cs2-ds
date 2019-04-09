package ds;

import static org.junit.Assert.*;
import org.junit.Test;

public class DataStructuresTest {
    @Test
    public void linkedListAddAndGet() {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1); l.add(2); l.add(3);
        assertEquals(3, l.size());
        assertEquals(Integer.valueOf(2), l.get(1));
        assertTrue(l.contains(3));
        assertFalse(l.contains(42));
    }

    @Test
    public void stackIsLifo() {
        Stack<String> s = new Stack<>();
        s.push("a"); s.push("b");
        assertEquals("b", s.pop());
        assertEquals("a", s.pop());
        assertTrue(s.isEmpty());
    }

    @Test
    public void queueIsFifo() {
        Queue<String> q = new Queue<>();
        q.enqueue("a"); q.enqueue("b");
        assertEquals("a", q.dequeue());
    }

    @Test
    public void bstContains() {
        BST<Integer> t = new BST<>();
        for (int v : new int[]{5, 3, 8, 1, 4}) t.insert(v);
        assertTrue(t.contains(4));
        assertFalse(t.contains(7));
        assertEquals(3, t.height());
    }
}

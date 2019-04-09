package ds;

public class BST<T extends Comparable<T>> {
    private class Node {
        T value;
        Node left, right;
        Node(T v) { value = v; }
    }

    private Node root;
    private int size;

    public void insert(T v) { root = insert(root, v); }

    private Node insert(Node n, T v) {
        if (n == null) { size++; return new Node(v); }
        int c = v.compareTo(n.value);
        if (c < 0) n.left = insert(n.left, v);
        else if (c > 0) n.right = insert(n.right, v);
        return n;
    }

    public boolean contains(T v) {
        Node cur = root;
        while (cur != null) {
            int c = v.compareTo(cur.value);
            if (c == 0) return true;
            cur = c < 0 ? cur.left : cur.right;
        }
        return false;
    }

    public int height() { return height(root); }

    private int height(Node n) {
        if (n == null) return 0;
        return 1 + Math.max(height(n.left), height(n.right));
    }

    public java.util.List<T> inOrder() {
        java.util.List<T> out = new java.util.ArrayList<>();
        inOrder(root, out);
        return out;
    }

    private void inOrder(Node n, java.util.List<T> out) {
        if (n == null) return;
        inOrder(n.left, out);
        out.add(n.value);
        inOrder(n.right, out);
    }

    public int size() { return size; }
}

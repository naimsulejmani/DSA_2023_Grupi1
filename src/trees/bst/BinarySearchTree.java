package trees.bst;

public class BinarySearchTree<T extends Comparable<T>> {
    private Node<T> root;
    private int size;

    public BinarySearchTree() {
    }

    public boolean isEmpty() {
        return root == null; // return size == 0;
    }

    public void add(T key) {
        Node<T> newNode = new Node<>(key);

        if (isEmpty()) {
            root = newNode;
        } else {
            addHelper(root, newNode);
        }
        size++;
    }

    private void addHelper(Node<T> current, Node<T> newNode) {
        if (newNode.getKey().compareTo(current.getKey()) < 0) {
            if (current.getLeft() == null) {
                current.setLeft(newNode);
            } else {
                addHelper(current.getLeft(), newNode);
            }
        } else {
            if (current.getRight() == null) {
                current.setRight(newNode);
            } else addHelper(current.getRight(), newNode);
        }
    }

    public int getSize() {
        return size;
    }

    public void inOrder() {
        inOrder(this.root);
    }

    private void inOrder(Node<T> root) {
        if (root == null)
            return;

        inOrder(root.getLeft());
        System.out.println(root.getKey());
        inOrder(root.getRight());
    }

    public void preOrder() {
        preOrder(this.root);
    }

    private void preOrder(Node<T> root) {
        if (root == null)
            return;

        System.out.println(root.getKey());
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public void postOrder() {
        postOrder(this.root);
    }

    private void postOrder(Node<T> root) {
        if (root == null)
            return;

        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.println(root.getKey());
    }

    public void descOrder() {
        descOrder(this.root);
    }

    private void descOrder(Node<T> root) {
        if (root == null)
            return;

        descOrder(root.getRight());
        System.out.println(root.getKey());
        descOrder(root.getLeft());
    }

    public boolean search(T key) {
        return search(this.root, key);
    }

    private boolean search(Node<T> root, T key) {
        if (root == null) return false;

        if (root.getKey().compareTo(key) == 0) return true;

        if (key.compareTo(root.getKey()) < 0)
            return search(root.getLeft(), key);
        else
            return search(root.getRight(), key);
    }

    public T minimum() {
        if (isEmpty()) return null;
        return minimum(this.root);
    }

    private T minimum(Node<T> root) {
        Node<T> temp = root;
        while (temp.getLeft() != null) {
            temp = temp.getLeft();
        }
        return temp.getKey();
    }

    public T maximum() {
        if (isEmpty()) return null;
        return maximum(this.root);
    }

    private T maximum(Node<T> root) {
        while (root.getRight() != null) {
            root = root.getRight();
        }
        return root.getKey();
    }

    public T successor() {
        if (isEmpty()) return null;

       return minimum(this.root.getRight());
       // return maximum(this.root.getLeft());
    }

}















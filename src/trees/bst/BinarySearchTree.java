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
            Node<T> temp = null;
        }
    }

}















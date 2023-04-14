package linked_lists.generics;

public class LinkedList<T> {
    private Node<T> head;
    private int count;

    public LinkedList() {
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int count() {
        return count;
//        if (isEmpty()) return 0;
//
//        Node<T> curr = head;
//        int counter = 0;
//
//        while (curr != null) {
//            counter++;
//            curr = curr.getNext();
//        }
//        return counter;
    }


    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNext(head);
        head = newNode;
        count++;
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);

        if (isEmpty()) head = newNode;
        else {
            Node<T> curr = head;
            while (curr.getNext() != null) { // ketu jam duke e lyp nyjen qe next eshte null
                curr = curr.getNext();
            }
            curr.setNext(newNode);
        }
        count++;
    }

    public Node<T> pop() {
        if (isEmpty()) return null;
        Node<T> popNode = head;
        head = head.getNext();
        count--;
        return popNode;
    }

    public T popElement() {
        Node<T> popNode = pop();
        if (popNode == null) return null;
        return popNode.getData();
    }

    public void print() {
        Node<T> curr = head;
        while (curr != null) {
            System.out.println(curr.getData());
            curr = curr.getNext();
        }
    }

    public Node<T> findByIndex(int index){
        if (index < 0 || index >= count) return null;

        Node<T> curr = head;
        for (int i = 0; i<index; i++){
            curr = curr.getNext();
        }
        return curr;
    }


}








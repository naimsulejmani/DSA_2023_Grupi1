package linked_lists.doubly;

public class DoublyLinkedList {
    private DoublyNode head;
    private DoublyNode tail;

    private int size = 0;


    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int data) {
        DoublyNode newNode = new DoublyNode(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
        size++;
    }

    public void addLast(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        size++;
    }

    public void printDesc() {
        DoublyNode temp = tail;

        while (temp != null) {
            System.out.println(temp);
            temp = temp.getPrev();
        }
    }


}











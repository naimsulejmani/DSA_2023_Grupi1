package linked_lists;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.getNext();
        }
    }

    public Node findByData(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.getData() == data)
                return temp;
            temp = temp.getNext();
        }
        return null;
    }

    public boolean contains(int data) {
        return findByData(data) != null;
    }

}








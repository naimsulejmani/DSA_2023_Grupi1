package linked_lists;

public class LinkedList {
    private Node head;
    private int size = 0;

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
        size++;
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

    public void reset() {
        head = null;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) head = newNode;
        else {
// // OLD LOGIC
//            Node temp = head;
//            while (temp.getNext() != null) {
//                temp = temp.getNext();
//            }
//            temp.setNext(newNode);

            // Ideja e Orges Dreshaj
            addAfterIndex(size - 1, data);
        }
        size++;
    }

    public Node findByIndex(int index) {
        if (index > size && index < 0) return null;
        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    public void removeFirst() {
        if (!isEmpty()) {
            head = head.getNext();
            size--;
        }
    }

    public void removeLast() {
        if (!isEmpty()) {
            if (size == 1) {
                head = null;
                size--;
            } else {
                // toArray()[size - 2].setNext(null);
                removeByIndex(size - 1);
            }
            // Bleroni mos harro prof ❤️
            System.out.println("BLERONI BANI PROBLEM");
        }
    }

    public void addAfterIndex(int index, int data) {
        Node newNode = new Node(data);
        if (isEmpty() && index == 0) {
            head = newNode;
            size++;
        } else {
            Node node = findByIndex(index);
            if (node != null) {

                newNode.setNext(node.getNext());
                node.setNext(newNode);
                size++;
            }
        }
    }

    public void removeByIndex(int index) {
        if (!isEmpty()) {
            if (size == 1 && index == 0) {
                head = null;
            } else {
                Node removedNode = findByIndex(index);
                Node prevNode = findByIndex(index - 1);
                prevNode.setNext(removedNode.getNext());
            }
            size--;
        }
    }

    public Node[] toArray() {
        Node[] array = new Node[size];
        Node temp = head;
        for (int i = 0; i < size; i++) {
            array[i] = temp;
            temp = temp.getNext();
        }
        return array;
    }

    public int size() {
        return size;
    }


}








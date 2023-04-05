package linked_lists.doubly;

public class DoublyTest {
    public static void main(String[] args) {
        DoublyLinkedList lista = new DoublyLinkedList();
        lista.addFirst(100);
        lista.addLast(1000);
        lista.addFirst(10);

        lista.printDesc();
    }
}

package linked_lists.generics;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        lista.addFirst("Erblini");
        lista.addFirst("Dafina");
        lista.addFirst("Blerimi");
        lista.addFirst("Arbenita");
        lista.addLast("Sharr");
        lista.addLast("Zylfi");
        lista.addFirst("Ali");
        System.out.println("Size: " + lista.count());
        System.out.println("POP: " + lista.pop());
        System.out.println("POP ELEMENT: " + lista.popElement());
        lista.print();
        System.out.println(lista.findByIndex(3));
    }
}









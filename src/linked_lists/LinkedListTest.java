package linked_lists;

import java.util.Arrays;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        lista.addFirst(100);
        lista.addFirst(10);
        lista.addFirst(1);

        lista.addAfterIndex(1, 25);

        System.out.println(lista.isEmpty());

        lista.print();
        System.out.println("-------------");

        lista.removeFirst();
        lista.removeLast();

        Node[] array = lista.toArray();

        System.out.println(Arrays.toString(array));


//        System.out.println(lista.findByIndex(0));
//        System.out.println(lista.findByIndex(2));


//        System.out.println("REMOVE FIRST");
//        lista.removeFirst();
//        lista.print();
//        lista.print();
//        System.out.println(lista.isEmpty());
//
//        System.out.println(lista.findByData(10));
//        System.out.println(lista.findByData(1000));
//
//        System.out.println(lista.contains(10));
//        System.out.println(lista.contains(1000));
    }
}










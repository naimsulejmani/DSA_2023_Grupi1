package linked_lists.generics;

import adts.Counter;

public class NodeTest {
    public static void main(String[] args) {
        Node<Double> node = new Node<>(10.1);
        System.out.println(node);

        Node<Integer> nodeInt = new Node<>(10);
        System.out.println(nodeInt);

        Node<String> nodeString = new Node<>("Profa");
        System.out.println(nodeString);

        Node<Counter> counterNode = new Node<>(new Counter("LVV"));
        System.out.println(counterNode);
    }
}







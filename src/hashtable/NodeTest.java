package hashtable;

import java.time.LocalDate;

public class NodeTest {
    public static void main(String[] args) {
        Node<Integer, String> n1 = new Node<>(1, "Naim");
        Node<Integer, String> n2 = new Node<>(2, "Erblin");
        Node<String, String> n3 = new Node<>("password", "VeryComplicat3dP@ssw0rd!99");
        Node<String, LocalDate> n4 = new Node<>("birthdate", LocalDate.now());

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
    }
}







package advanced_sorts;

import java.util.Arrays;

public class HeapSortTest {
    public static void main(String[] args) {
        String[] names = new String[]{"Test", "Alban", "Zeke", "festim", "hasime", "fadile", "xhemile"};

        Sortable<String> sortable = new HeapSort<>();
        sortable.sort(names);

        System.out.println(Arrays.toString(names));
    }
}

package advanced_sorts;

import java.util.Arrays;

public class ShellSortTest {
    public static void main(String[] args) {
        String[] names = {"Naja", "Lata", "Agimi", "Erolinda", "Mihrije", "Flutra"};
        Sortable<String> sortable = new ShellSort<>();
        sortable.sort(names);
        System.out.println(Arrays.toString(names));
    }
}

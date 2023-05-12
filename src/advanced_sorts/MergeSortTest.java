package advanced_sorts;

import java.util.Arrays;

public class MergeSortTest {
    public static void main(String[] args) {
        Integer[] numbers = {10, 5, 2, 23, 45, 21, 7};

        Sortable<Integer> sortable = new MergeSort<>(Integer.class);
        sortable.sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}

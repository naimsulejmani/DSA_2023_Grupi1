package elementary_sorts;

import shared.Helper;

public class BubbleSort {

    public static void bubbleSortEnhanced(int[] array) {
        boolean swapped = true;
        //numri i iterimeve
        for (int i = 0; i < array.length && swapped; i++) {
            swapped = false; // supozojme se ska me pas elemente per SWAP
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // SWAP ELEMENTS
                    swapped = true;
                    int temp = array[j]; // ruaje array-j ne nje variable te perkohshme
                    array[j] = array[j + 1]; // ruaj ne array-j tashme elementin vijues
                    array[j + 1] = temp; // ne elemetin vijues ruaje variablen e perkohshme (array-y)
                }
            }
        }
    }

    public static void bubbleSort(int[] array) {
        //numri i iterimeve
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // SWAP ELEMENTS
                    int temp = array[j]; // ruaje array-j ne nje variable te perkohshme
                    array[j] = array[j + 1]; // ruaj ne array-j tashme elementin vijues
                    array[j + 1] = temp; // ne elemetin vijues ruaje variablen e perkohshme (array-y)
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = Helper.generate(10, 1, 100);
        System.out.println("Vargu i pasortuar");
        Helper.print(array);
        bubbleSortEnhanced(array); // sorto elementet
        //bubbleSort(array);
        System.out.println("Vargu i sortuar");
        Helper.print(array);
    }
}










package advanced_sorts;

public class HeapSort<T extends Comparable<T>> implements Sortable<T> {
    @Override
    public void sort(T[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, array.length, i);
        }

        for (int i = array.length - 1; i > 0; i--) {
            T temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }

    private void heapify(T[] array, int length, int currentIndex) {
        int largest = currentIndex;
        int leftIndex = currentIndex * 2 + 1;
        int rightIndex = currentIndex * 2 + 2; // leftIndex + 1;

        if (largest < length && array[leftIndex].compareTo(array[largest]) > 0) {
            largest = leftIndex;
        }
        if (largest < length && array[rightIndex].compareTo(array[largest]) > 0) {
            largest = rightIndex;
        }
        if (currentIndex != largest) {
            T temp = array[currentIndex];
            array[currentIndex] = array[largest];
            array[largest] = temp;
            heapify(array, length, largest);
        }
    }
}
















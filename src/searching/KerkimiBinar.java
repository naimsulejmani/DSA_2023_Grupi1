package searching;

public class KerkimiBinar {
    public static void main(String[] args) {
        int[] array = {10, 20, 22, 33, 44, 56, 78, 99, 122, 234, 1234, 52434};
        int index = binarySearch(array, 1234);
        System.out.println(index);
    }

    public static int binarySearch(int[] array, int element) {
        int low, high, mid;
        low = 0;
        high = array.length - 1;
        while (high >= low) {
            mid = (low + high) / 2;

            if (array[mid] == element)
                return mid;

            if (array[mid] > element) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}











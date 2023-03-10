package recursion;

public class BinaryRecursion {
    public static int binary(int[] array, int search, int low, int height) {

        if (low <= height) {
            int mid = (low + height) / 2;
            if (array[mid] == search)
                return mid;
            else if (search < array[mid])
                return binary(array, search, low, mid - 1);
            else return binary(array, search, mid + 1, height);

        }
        return -1;
    }

    public static int binarySearch(int[] array, int search) {
        return binary(array, search, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        System.out.println(binarySearch(array, 15));
        System.out.println(binarySearch(array, 2));
    }
}







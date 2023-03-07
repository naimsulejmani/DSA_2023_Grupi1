package searching;

public class KerkimiSekuencial {
    public static void main(String[] args) {
        int[] array = {10, 85, 36, 64, 12, 36, 5, 9, 7, 12};
        System.out.println(contains(array, 7));
        System.out.println(contains(array, -7));


        System.out.println(indexOf(array, 7));
        System.out.println(indexOf(array, -7));
    }

    public static boolean contains(int[] array, int element) {
        for (int number : array) {
            if (number == element)
                return true;
        }
        return false;
    }

    public static int indexOf(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if (number == element)
                return i;
        }
        return -1;
    }
}







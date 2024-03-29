package shared;

public class Helper {
    public static int[] generate(int length, int minValue, int maxValue) {
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * (maxValue - minValue + 1) + minValue);
        }

        return array;
    }

    public static void print(int[] array) {
        for (int number : array) {
            System.out.printf("%d ", number);
        }
        System.out.println();
    }

    public static void swap(int[] array, int from, int to) {
        int temp = array[from];
        array[from] = array[to];
        array[to] = temp;
    }

    public static <T> void swap(T[] array, int from, int to) {
        T temp = array[from];
        array[from] = array[to];
        array[to] = temp;
    }

}








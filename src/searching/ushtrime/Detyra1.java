package searching.ushtrime;

public class Detyra1 {
    public static int min(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int n : array) {
            if (n < min) min = n;
        }
        return min;
    }

    public static int min(int[] array, boolean returnIndex) {
        int minIndex = 0;
        int minValue = array[minIndex];
        for (int i = 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return returnIndex ? minIndex : minValue;
    }

    public static int[] minimumiV1(int[] array) {
        int minIndex = 0;
        int minValue = array[minIndex];
        for (int i = 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return new int[]{minIndex, minValue};
    }

    public static String minimumiV2(int[] array) {
        int minIndex = 0;
        int minValue = array[minIndex];
        for (int i = 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return String.format("%d;%d", minIndex, minValue); // 1;-199
    }

    public static Minimumi minimumiV3(int[] array) {
        int minIndex = 0;
        int minValue = array[minIndex];
        for (int i = 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return new Minimumi(minIndex, minValue);
    }
}












package searching.ushtrime;

public class Detyra1Test {
    public static void main(String[] args) {
        int[] array = {12, 3, 412, 1231, 41, 34, 13, 99, 23, 12};
        System.out.println(Detyra1.min(array));
        System.out.println(Detyra1.min(array, true));
        System.out.println(Detyra1.minimumiV1(array)[0]);
        System.out.println(Detyra1.minimumiV1(array)[1]);
        System.out.println(Detyra1.minimumiV2(array));
        System.out.println(Detyra1.minimumiV3(array).getIndex());
        System.out.println(Detyra1.minimumiV3(array).getValue());

    }
}

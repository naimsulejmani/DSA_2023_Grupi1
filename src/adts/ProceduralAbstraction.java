package adts;

import shared.Helper;

public class ProceduralAbstraction {
    public static void main(String[] args) {
        // int[] array = {1,2,3,4,5};
        int[] array = Helper.generate(100, 1, 1000);
        int shuma = sum(array);
        int min = min(array);
        System.out.printf("Total numra jane: %d %n", array.length);
        System.out.printf("Shuma e vargut eshte: %d %n", shuma);
        System.out.printf("Vlera me e vogel ne varg: %d %n", min);
    }

    private static int min(int[] array) {
        return 0;
    }

    public static int sum(int[] array) {
        // here we should implement sum of the array
        // TODO: Implement sum methods
        return 0;
    }
}









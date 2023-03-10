package searching.ushtrime;

public class Detyra3 {
    public static long shumaEVargut(int[] vargu) {
        int shuma = 0;
        for (int numri : vargu) {
            shuma += numri;
        }
        return shuma;
    }

    public static void main(String[] args) {
        int[] vargu = {1, 2, 3};
        System.out.println(shumaEVargut(vargu));
    }
}







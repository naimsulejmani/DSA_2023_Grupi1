package searching;

public class UshtrimeMeArray {
    public static void main(String[] args) {
        // Definimi i vargjeve
        int[] numrat = new int[3];
        int[] numratTjere = new int[]{1, 2, 3};
        int[] numratTjereTjere = {1, 2, 3};

        String[] emrat = {"Filani", "Fisteku", "Naimi", "Test", "KuPeDiUne"};

        int[][] grades = new int[5][5];
        int[][] gradesTjeter = new int[][]{
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };
        int[][] gradesTjeterTjeter = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };

        grades[1][1] = 10;
        int vlera = grades[1][1];
    }
}












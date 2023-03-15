package shared;

public class ArrayGeneratorTest {
    public static void main(String[] args) {
        int[] vargu = ArrayGenerator.generate(10, 10, 50);
        ArrayGenerator.print(vargu);
    }
}

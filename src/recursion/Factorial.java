package recursion;

public class Factorial {
    public static long factorial(int number) {
        // base case , rasti baze
        if (number <= 1)
            return 1;
        return number * factorial(number - 1);
        // 1
        // 2 * 1!
        // 3 * 2!
        // 4 * 3!
    }

    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
}







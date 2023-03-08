package recursion;

public class CollatzSequence {
    public static void collatz(int number) {
        System.out.print(number + " ");
        if (number == 1) return;
        if (number % 2 == 0) collatz(number / 2);
        else collatz(number * 3 + 1);
    }

    public static void main(String[] args) {
        collatz(101);
        System.out.println();
        collatz(756487);
    }
}

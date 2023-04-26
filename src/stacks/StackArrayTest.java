package stacks;

public class StackArrayTest {
    public static void main(String[] args) throws StackOverflowException, StackUnderflowException {
        StackArray<String> ushqimetPerIfar = new StackArray<>(3);
        ushqimetPerIfar.push("hurma");
        ushqimetPerIfar.push("sup");
        ushqimetPerIfar.push("sallate");
        //ushqimetPerIfar.push("gullash");
        System.out.println(ushqimetPerIfar.peek());
        System.out.println(ushqimetPerIfar.pop());
        System.out.println(ushqimetPerIfar.peek());
    }
}

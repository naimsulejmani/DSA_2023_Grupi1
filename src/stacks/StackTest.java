package stacks;

public class StackTest {
    public static void main(String[] args) throws StackOverflowException, StackUnderflowException {
        Stack<String> stack = new Stack<>(3);
        stack.push("Aldi");
        stack.push("Blendi");
        stack.push("Gazi");
//        stack.push("Gullashi");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

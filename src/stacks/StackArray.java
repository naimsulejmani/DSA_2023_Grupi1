package stacks;

public class StackArray<T> {
    private final int MAX_SIZE;
    private Object[] elements;
    private int size;

    public StackArray(int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
        this.elements = new Object[MAX_SIZE];
    }

    public StackArray() {
        this(100);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    public void push(T data) throws StackOverflowException {
        if (isFull())
            throw new StackOverflowException("Stack is full! Cannot insert " + data + " into stack!");
        elements[size++] = data;
    }

    public T pop() throws StackUnderflowException {
        T data = peek();
        elements[--size] = null;
        return data;
    }

    public T peek() throws StackUnderflowException {
        if (isEmpty()) throw new StackUnderflowException("Stack is empty!");
        T data = (T) elements[size - 1];
        return data;
    }
}

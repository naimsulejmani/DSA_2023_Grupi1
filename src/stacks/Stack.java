package stacks;

public class Stack<T> {
    private final int MAX_SIZE;
    private Element<T> top;
    private int size;

    public Stack(int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
    }

    public Stack() {
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
        top = new Element<>(data, top);
//        Element<T> newElement = new Element<>(data);
//        newElement.setNext(top);
//        top = newElement;
        size++;
    }

    public T pop() throws StackUnderflowException {
//        if (isEmpty()) throw new StackUnderflowException("Stack is empty!");
//        T data = top.getData();
        T data = peek();
        top = top.getNext();
        size--;
        return data;
    }

    public T peek() throws StackUnderflowException {
        if (isEmpty()) throw new StackUnderflowException("Stack is empty!");
        return top.getData();
    }


}












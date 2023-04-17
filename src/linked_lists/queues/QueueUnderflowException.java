package linked_lists.queues;

public class QueueUnderflowException extends Exception {
    public QueueUnderflowException() {
    }

    public QueueUnderflowException(String message) {
        super(message);
    }
}

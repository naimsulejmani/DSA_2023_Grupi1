package queues;

public class QueueTest {
    public static void main(String[] args) throws QueueOverflowException, QueueUnderflowException {
        Queue<String> pritjaPerKonsultime = new Queue<>(3);
        pritjaPerKonsultime.enqueue("Edipi");
        pritjaPerKonsultime.enqueue("Erblini");
        pritjaPerKonsultime.enqueue("Erolinda");
        System.out.println(pritjaPerKonsultime.offer("Gazi"));
        System.out.println(pritjaPerKonsultime.dequeue());
        System.out.println(pritjaPerKonsultime.dequeue());
        System.out.println(pritjaPerKonsultime.dequeue());
        System.out.println(pritjaPerKonsultime.offer("Gazi"));
        System.out.println(pritjaPerKonsultime.dequeue());
    }
}

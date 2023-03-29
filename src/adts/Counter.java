package adts;

public class Counter {
    private String id;
    private int value;

    public Counter(String id) {
        this.id = id;
    }
    public void increment() {
        value++;
    }
    public int tally() {
        return value;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "id='" + id + '\'' +
                ", value=" + value +
                '}';
    }
}









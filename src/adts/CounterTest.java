package adts;

public class CounterTest {
    public static void main(String[] args) {
        Counter lvv = new Counter("LVV");
        Counter pdk = new Counter("PDK");

        lvv.increment();
        lvv.increment();
        lvv.increment();
        pdk.increment();

        System.out.println(lvv.tally());
        System.out.println(pdk.tally());

        System.out.println(lvv);
        System.out.println(pdk);
    }
}





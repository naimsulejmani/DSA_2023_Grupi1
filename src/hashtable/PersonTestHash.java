package hashtable;

import java.time.LocalDate;

public class PersonTestHash {
    public static void main(String[] args) {
        Person p = new Person(1, "Naim", LocalDate.of(2000, 1, 1), 76f);
        Person p1 = new Person(1, "Naim", LocalDate.of(2000, 1, 1), 76f);
        System.out.println(p.hashCode() == p1.hashCode());
        System.out.println(p.hashCode());
        System.out.println(p1.hashCode() % 30);


        System.out.println("NAIM".hashCode() % 30);
        System.out.println("ERBLINES".hashCode() % 30);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(hash(Integer.MIN_VALUE,11));
    }

    public static int hash(int hashCode, int modulus) {
        return (hashCode & 0x7FFFFFFF) % modulus;
    }
}

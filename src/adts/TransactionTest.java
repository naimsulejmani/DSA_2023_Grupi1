package adts;

import java.time.LocalDate;

public class TransactionTest {
    public static void main(String[] args) {
        Transaction transaction =
                new Transaction("Naim Sulejmani", LocalDate.now(), 100.50);
        System.out.println(transaction);

        Transaction erblinTransaction = new Transaction("Erblini;2023-02-17;123.45");
        System.out.println(erblinTransaction.amount());
        System.out.println(erblinTransaction.who());
        System.out.println(erblinTransaction.when());
        System.out.println(erblinTransaction);


        Transaction gaziTransaction = new Transaction("Gazmend;Rashiti;2020-01-01;123131.2");
        System.out.println(gaziTransaction);
    }
}












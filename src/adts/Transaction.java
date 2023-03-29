package adts;

import javax.naming.spi.DirObjectFactory;
import java.time.LocalDate;

public class Transaction implements Comparable<Transaction> {

    private String who;
    private LocalDate when;
    private double amount;

    public Transaction(String who, LocalDate when, double amount) {
        this.who = who;
        this.when = when;
        this.amount = amount;
    }

    //Naim Sulejmani;2023-03-28;100.50
    public Transaction(String transaction) {
        String[] array = transaction.split(";");
        if (array.length == 3) {
            who = array[0];
            when = LocalDate.parse(array[1]);
            amount = Double.parseDouble(array[2]);
        } else {
            throw new IllegalArgumentException("Standardi eshte: who;when;amount");
        }
    }

    public LocalDate when() {
        return when;
    }

    public String who() {
        return who;
    }

    public double amount() {
        return amount;
    }

    @Override
    public int compareTo(Transaction o) {
//        if(amount<o.amount) return -1;
//        else if(amount>o.amount) return 1;
//        return 0;
        return Double.compare(amount, o.amount);
    }

    @Override
    public String toString() {
        return String.format("%s;%s;%.2f", who, when, amount);
    }
}










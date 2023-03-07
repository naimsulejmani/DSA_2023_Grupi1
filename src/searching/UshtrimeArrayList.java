package searching;

import java.util.ArrayList;
import java.util.Objects;

public class UshtrimeArrayList {
    public static void main(String[] args) {
        ArrayList emrat = new ArrayList();
        emrat.add("Naimi");
        emrat.add("Filanin");
        emrat.add("Fisteku");
        emrat.add("Edipin");
        emrat.add(0, "Erblini");
        emrat.add(10);
        emrat.add(20F);
        emrat.add(true);
        emrat.add(5L);
        emrat.add('C');
        emrat.add(10.10D);

        String emriPare = emrat.get(0).toString();
        int numriPare = (int) emrat.get(5);
        System.out.println(emriPare);
        System.out.println(numriPare);

        for (Object item : emrat) {
            System.out.println(item);
        }

        emrat.remove(0);
        emrat.remove("Edipin");
        emrat.remove(true);

        System.out.println(emrat.contains("Fisteku"));

        emrat.clear();


    }
}












package hashtable;

import java.time.LocalDate;

public class Person {
    private int id;
    private String name;
    private LocalDate birthdate;
    private float pesha;

    public Person(int id, String name, LocalDate birthdate, float pesha) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.pesha = pesha;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + Integer.hashCode(id);
        hash = 31 * hash + name.hashCode();
        hash = 31 * hash + birthdate.hashCode();
        hash = 31 * hash + Float.hashCode(pesha);
        return hash;
    }
}











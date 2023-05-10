package advanced_sorts;

@FunctionalInterface
// single abstract method -> SAM Interface
public interface Sortable<T extends Comparable<T>> {
    void sort(T[] array);
}

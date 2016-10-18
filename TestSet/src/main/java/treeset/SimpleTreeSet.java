package treeset;

public interface SimpleTreeSet<T extends Comparable<T>> {

    Node<T> find(T elem);
    void add(T elem);
    void delete(T elem);
    void showSet();
}

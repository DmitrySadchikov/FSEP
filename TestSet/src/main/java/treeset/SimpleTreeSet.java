package treeset;

public interface SimpleTreeSet<T> {

    SimpleTreeSet<T> find(T elem);
    void add(T elem);
    void delete(T elem);
    void showSet();
}

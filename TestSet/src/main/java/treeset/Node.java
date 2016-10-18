package treeset;

public class Node<T extends Comparable<T>> {
    Node<T> left;
    Node<T> right;
    T value;

    Node(T value) {
        this.value = value;
    }
}

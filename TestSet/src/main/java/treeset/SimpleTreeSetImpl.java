package treeset;

import java.util.Comparator;

public class SimpleTreeSetImpl<T extends Comparable<T>> implements SimpleTreeSet<T>, Comparator<T> {

    private SimpleTreeSet<T> left;
    private SimpleTreeSet<T> right;
    private T value;


    @Override
    public SimpleTreeSet<T> find(T elem) {
        if(this == null) {
            System.out.println("Пустое множество.");
            return null;
        }
        switch (compare(elem, this.value)) {
            case 0:
                return this;
            case -1:
                return this.left.find(elem);
            case 1:
                return this.right.find(elem);
        }
        return null;
    }

    @Override
    public void add(T elem) {
        if(this == null)
            this.value = elem;
        else {
            switch (compare(elem, this.value)) {
                case -1:
                    this.left.add(elem);
                    break;
                case 1:
                    this.right.add(elem);
                    break;
            }
        }
    }

    @Override
    public void delete(T elem) {
        if(this == null) {
            System.out.println("Пустое множество. Удалять нечего.");
            return;
        }
        switch (compare(elem, this.value)) {
            case -1:
                this.left.delete(elem);
                break;
            case 1:
                this.right.delete(elem);
                break;
            case 0: {
                if(this.left == null && this.right == null) {
                    //???
                }

            }
        }
    }

    @Override
    public void showSet() {

    }

    @Override
    public int compare(T o1, T o2) {
        return o1.compareTo(o2);
    }
}

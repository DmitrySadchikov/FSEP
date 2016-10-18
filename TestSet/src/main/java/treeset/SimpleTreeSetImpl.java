package treeset;

import java.util.Comparator;

public class SimpleTreeSetImpl<T extends Comparable<T>> implements SimpleTreeSet<T>, Comparator<T> {

    /*static class Node<T extends Comparable<T>> {
        Node<T> left;
        Node<T> right;
        T value;

        Node(T value) {
            this.value = value;
        }

    }*/

    private Node<T> root;

    public SimpleTreeSetImpl() {
        this.root = null;
    }

    /**
     * Поиск элемента по значению
     * Возвращает ссылку на узел, если элемент найден
     * Возвращает null, если элемент не найден или множество пустое
     * @param elem
     * @return
     */

    @Override
    public Node<T> find(T elem) {
        if(this.root == null) {
            //System.out.println("Пустое множество.");
            return null;
        }

        Node<T> child = this.root;

        while (child != null) {
            switch (compare(elem, child.value)) {
                case 0:
                    return child;
                case -1:
                    child = child.left;
                    break;
                case 1:
                    child = child.right;
                    break;
            }
        }
        return null;

    }

    @Override
    public void add(T elem) {
        Node<T> node = new Node<>(elem);
        if(this.root == null)
            this.root = node;
        else {
            Node<T> parent = null;
            Node<T> child = this.root;
            while(child != null) {
                switch (compare(elem, child.value)) {
                    case 0:
                        System.out.println("Этот элемент уже содержится во множестве.");
                        return;
                    case -1:
                        parent = child;
                        child = child.left;
                        break;
                    case 1:
                        parent = child;
                        child = child.right;
                        break;
                }
            }

            switch (compare(elem, parent.value)) {
                case -1:
                    parent.left = node;
                    break;
                case 1:
                    parent.right = node;
                    break;
            }
        }

    }


    @Override
    public void delete(T elem) { //удалить корень
        if(this.root == null) {
            System.out.println("Пустое множество. Удалять нечего.");
            return;
        }

        Node<T> parent = null;
        Node<T> child = this.root;
        boolean b = false;
        while (child != null && !b) {
            switch (compare(elem, child.value)) {
                case 0:
                    b = true;
                    break;
                case -1:
                    parent = child;
                    child = child.left;
                    break;
                case 1:
                    parent = child;
                    child = child.right;
                    break;
            }
        }



        if(child == null) {
            System.out.println("Элемента нет во множестве.");
            return;
        }

        if(child.left == null && child.right == null) {

            if(parent == null) {
                this.root = null;
                return;
            }

            if(child == parent.left)
                parent.left = null;
            else
                parent.right = null;
            return;
        }

        if(child.left == null) {

            if(parent == null) {
                this.root = child.right;
                return;
            }

            if(child == parent.left)
                parent.left = child.right;
            else
                parent.right = child.right;
            return;
        }

        if(child.right == null) {

            if(parent == null) {
                this.root = child.left;
                return;
            }

            if(child == parent.left)
                parent.left = child.left;
            else
                parent.right = child.left;
            return;
        }

        if(child.right.left == null) {
            child.right.left = child.left;

            if(parent == null) {
                this.root = child.right;
                return;
            }

            if(child == parent.left)
                parent.left = child.right;

            else
                parent.right = child.right;
            return;
        }

        Node<T> parentMin = child.right;
        Node<T> childMin = child.right.left;
        while(child.left != null) {
            parentMin = childMin;
            childMin = childMin.left;
        }

        child.value = childMin.value;
        if(childMin.right != null) {
            parentMin.left = childMin.right;
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

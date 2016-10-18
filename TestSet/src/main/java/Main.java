import arrayset.SimpleSet;
import arrayset.SimpleSetImpl;
import treeset.Node;
import treeset.SimpleTreeSet;
import treeset.SimpleTreeSetImpl;

public class Main {

    public static void main(String[] args) {
        /*
        SimpleSet<Integer> integerSimpleSet = new SimpleSetImpl<>();
        for (int i = 0; i < 15; i++) {
            integerSimpleSet.add(i);
        }
        System.out.println("Добавление элементов типа Integer: ");
        integerSimpleSet.showSet();
        integerSimpleSet.add(13);
        System.out.println("Удаление элемента: ");
        integerSimpleSet.delete(10);
        integerSimpleSet.showSet();

        SimpleSet<String> stringSimpleSet = new SimpleSetImpl<>();
        for (int i = 0; i < 15; i++) {
            stringSimpleSet.add("s" + i);
        }
        System.out.println("Добавление элементов типа String: ");
        stringSimpleSet.showSet();
        System.out.println("Удаление элемента: ");
        stringSimpleSet.delete("s10");
        stringSimpleSet.showSet();*/

        SimpleTreeSet<Integer> simpleTreeSet = new SimpleTreeSetImpl<>();
        simpleTreeSet.add(10);
        simpleTreeSet.add(12);
        simpleTreeSet.add(8);
        simpleTreeSet.add(6);
        simpleTreeSet.delete(10);
        int i = 0;
    }

}

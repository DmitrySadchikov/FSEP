import arrayset.SimpleSet;
import arrayset.SimpleSetImpl;
import treeset.Node;
import treeset.SimpleTreeSet;
import treeset.SimpleTreeSetImpl;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

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
        stringSimpleSet.showSet();

        SimpleTreeSet<Integer> simpleTreeSet = new SimpleTreeSetImpl<>();
        Random random = new Random();
        for(int i = 0; i < 20; i++)
            simpleTreeSet.add(random.nextInt(200));

        System.out.println("Обход дерева в ширину:");
        simpleTreeSet.showSet();

    }

}

import arrayset.SimpleSet;
import arrayset.SimpleSetImpl;

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
    }

}

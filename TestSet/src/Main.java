
public class Main {

    public static void main(String[] args) {
        SimpleSet<Integer> set = new SimpleSetImpl<>();
        for (int i = 0; i < 15; i++) {
            set.add(i);
        }
        System.out.println("Добавление элементов: ");
        set.showSet();
        System.out.println("После удаления элемента: ");
        set.delete(10);
        set.showSet();
    }

}

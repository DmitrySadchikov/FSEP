
public class SimpleSetImpl<T> implements SimpleSet<T> {

    private int quantity;
    private T[] set;

    public SimpleSetImpl() {
        quantity = 0;
        set = (T[]) new Object[10];
    }

    @Override
    public int find(T elem) {
        for (int i = 0; i < set.length; i++) {
            if(set[i].equals(elem))
                return i;
        }
        return -1;
    }

    @Override
    public void add(T elem) {
        if(quantity == set.length) {
            T[] newSet = (T[]) new Object[set.length * 2];
            for(int i = 0; i < set.length; i++)
                newSet[i] = set[i];
            set = newSet;
            set[quantity] = elem;
        }
        else
            set[quantity] = elem;
        quantity ++;
    }

    @Override
    public void delete(T elem) {
        int index = find(elem);
        if(index == -1){
            System.out.println("Такого элемента нет");
            return;
        }
        for(int i = index; i < quantity; i++) {
            set[i] = set[i + 1];
        }
        quantity --;
    }

    @Override
    public void showSet() {
        for (int i = 0; i < quantity; i++)
            System.out.print(set[i] + " ");
        System.out.println();
    }
}

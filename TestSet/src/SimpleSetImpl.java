
public class SimpleSetImpl implements SimpleSet {

    private int quantity;
    private int[] set;

    public SimpleSetImpl() {
        quantity = 0;
        set = new int[10];
    }

    @Override
    public int find(int elem) {
        for (int i = 0; i < set.length; i++) {
            if(set[i] == elem)
                return i;
        }
        return -1;
    }

    @Override
    public void add(int elem) {
        if(quantity == set.length) {
            int[] newSet = new int[set.length * 2];
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
    public void delete(int elem) {
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

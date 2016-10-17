import arrayset.SimpleSet;
import arrayset.SimpleSetImpl;
import org.junit.Before;
import org.junit.Test;

public class SimpleSetImplTest {

    SimpleSet<String> stringSimpleSet;

    @Before
    public void setUp() throws Exception {
        stringSimpleSet = new SimpleSetImpl<>();
    }

    @Test
    public void add() throws Exception {

        for (int i = 0; i < 15; i++) {
            stringSimpleSet.add("s" + i);
        }
        System.out.println("Добавление элементов: ");
        showSet();

    }

    @Test
    public void find() throws Exception {
        add();
        System.out.println("Индекс найденного элемента: " + stringSimpleSet.find("s9"));
    }

    @Test
    public void delete() throws Exception {
        add();
        stringSimpleSet.delete("s3");
        System.out.println("После удаления: ");
        showSet();
    }

    @Test
    public void showSet() throws Exception {
        stringSimpleSet.showSet();
    }

}
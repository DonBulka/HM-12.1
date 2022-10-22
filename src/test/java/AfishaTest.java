import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaTest {

    @Test
    public void testAll() {
        AfishaManager manager = new AfishaManager();
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");

        String[] actual = manager.findAll();
        String[] expected = {"Film1", "Film2", "Film3"};

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testLast() {
        AfishaManager manager = new AfishaManager(10);
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");
        manager.add("Film7");
        manager.add("Film8");
        manager.add("Film9");
        manager.add("Film10");

        String[] actual = manager.findLast(10);
        String[] expected = {"Film10", "Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};

        Assertions.assertArrayEquals(expected, actual);
    }
}

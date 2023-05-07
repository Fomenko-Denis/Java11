import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.FilmsManager;

public class ManagerTest {
    @Test
    public void test() {
        FilmsManager manager = new FilmsManager();
        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");

        String[] actual = manager.findAll();
        String[] expected = {"Movie I", "Movie II", "Movie III"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void noFilmsTest() {
        FilmsManager manager = new FilmsManager();


        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void oneFilmTest() {
        FilmsManager manager = new FilmsManager();
        manager.add("Movie I");


        String[] actual = manager.findAll();
        String[] expected = {"Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() {
        FilmsManager manager = new FilmsManager();
        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");

        String[] actual = manager.findLast();
        String[] expected = {"Movie III", "Movie II", "Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastAboveMaxTest() {
        FilmsManager manager = new FilmsManager();
        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");
        manager.add("Movie IV");
        manager.add("Movie V");
        manager.add("Movie VI");

        String[] actual = manager.findLast();
        String[] expected = {"Movie VI", "Movie V", "Movie IV", "Movie III", "Movie II"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastBelowMaxTest() {
        FilmsManager manager = new FilmsManager();
        manager.add("Movie I");
        manager.add("Movie II");


        String[] actual = manager.findLast();
        String[] expected = {"Movie II", "Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }
}
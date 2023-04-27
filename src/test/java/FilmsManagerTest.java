import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.FilmsManager;

import java.util.Arrays;

public class FilmsManagerTest {
    @Test

    public void testAllFilms(){
        FilmsManager manager = new FilmsManager();

        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");


        String[] actual = manager.findAll();
        String[] expected = { "Movie I", "Movie II", "Movie III" };
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testOneFilms(){
        FilmsManager manager = new FilmsManager();

        manager.add("Movie I");



        String[] actual = manager.findAll();
        String[] expected = { "Movie I" };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testNullFilms(){
        FilmsManager manager = new FilmsManager();


        String[] actual = manager.findAll();
        String[] expected = { "Movie I" };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testFindFilms(){
        FilmsManager manager = new FilmsManager();

        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");


        String[] actual = manager.findLast();
        String[] expected = { "Movie III", "Movie II", "Movie I" };
        Assertions.assertArrayEquals(expected, actual);
    }

}

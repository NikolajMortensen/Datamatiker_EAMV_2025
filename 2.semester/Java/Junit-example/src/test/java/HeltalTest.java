import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeltalTest {


    @Test
    public void testConstructor() {
        Heltal t = new Heltal(8);

        assertEquals(8, t.get());
    }

    @Test
    public void testSet() {
        Heltal t = new Heltal();
        t.set(5);

        assertEquals(5, t.get());
    }
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JellyfishTest {
    private Jellyfish jellyfish;

    @Test
    void testMakeSoundReturnsNull() {
        jellyfish = new Jellyfish("Medusa", 3, 50, 10);
        String sound = jellyfish.makeSound();
        assertNull(sound);
    }

    @Test
    void testInitialValues() {
        jellyfish = new Jellyfish("Medusa", 3, 50, 10);
        assertEquals("Medusa", jellyfish.getName());
        assertEquals(3, jellyfish.getAge());
        assertEquals(50, jellyfish.getEnergy());
        assertEquals(10, jellyfish.getSpeed());
    }

    @Test
    void testEnergyIsSetCorrectly() {
        jellyfish = new Jellyfish("Medusa", 5, 20, 5);
        assertEquals(20, jellyfish.getEnergy());
    }

    @Test
    void testSpeedIsSetCorrectly() {
        jellyfish = new Jellyfish("Medusa", 2, 30, 7);
        assertEquals(7, jellyfish.getSpeed());
    }
}

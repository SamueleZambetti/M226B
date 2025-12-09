import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DolphinTest {

    private Dolphin dolphin;

    @Test
    void testMakeSoundReturnsNull() {
        dolphin = new Dolphin("Flipper", 8, 70, 30, 20, 50);

        String sound = dolphin.makeSound();

        assertNull(sound);
    }

    @Test
    void testInitialValues() {
        dolphin = new Dolphin("Flipper", 8, 70, 30, 20, 50);

        assertEquals("Flipper", dolphin.getName());
        assertEquals(8, dolphin.getAge());
        assertEquals(70, dolphin.getEnergy());
        assertEquals(30, dolphin.getSpeed());
        assertEquals(20, dolphin.getFerocity());
        assertEquals(50, dolphin.getIntelligence());
    }

    @Test
    void testEatIncreasesEnergy() {
        dolphin = new Dolphin("Flipper", 8, 60, 30, 20, 50);

        dolphin.eat();

        assertEquals(85, dolphin.getEnergy()); // 60 + 25
    }

    @Test
    void testEatCapsEnergyAt100() {
        dolphin = new Dolphin("Flipper", 8, 90, 30, 20, 50);

        dolphin.eat();

        assertEquals(100, dolphin.getEnergy());
    }

    @Test
    void testHuntCanSucceed() {
        dolphin = new Dolphin("Flipper", 8, 90, 30, 20, 50);

        boolean result = dolphin.hunt();

        if (result) {
            assertTrue(dolphin.getEnergy() <= 100);
        } else {
            assertEquals(87, dolphin.getEnergy()); // 90 - 3
        }
    }

    @Test
    void testHuntDeathByStarvation() {
        dolphin = new Dolphin("Flipper", 8, 2, 10, 5, 10);

        dolphin.hunt();

        assertTrue(dolphin.getEnergy() <= 0);
    }

    @Test
    void testPlay() {
        dolphin = new Dolphin("Flipper", 8, 70, 30, 20, 50);

        assertDoesNotThrow(dolphin::play);
    }
}

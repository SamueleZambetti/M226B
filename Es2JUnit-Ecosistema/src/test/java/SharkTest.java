import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SharkTest {
private Shark shark;
    @Test
    void testMakeSound() {
        shark = new Shark("Bruce", 10, 80, 30, 40);
        String sound = shark.makeSound();
        assertEquals("Grrrrr", sound);
    }

    @Test
    void testEatIncreasesEnergy() {
        shark = new Shark("Bruce", 10, 50, 30, 40);
        shark.eat();
        assertEquals(70, shark.getEnergy());
    }

    @Test
    void testEatCapsEnergyAt100() {
        shark = new Shark("Bruce", 10, 95, 30, 40);
        shark.eat();
        assertEquals(100, shark.getEnergy());
    }
}

public class HerbivorousFish extends AquaticCreature {
    // ...existing code...
    public HerbivorousFish(String name, int age, double energy, double speed) {
        super(name, age, energy, speed);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + ": Blub blub");
    }
}


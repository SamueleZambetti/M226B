package AcquaticCreature;
public class HerbivorousFish extends AquaticCreature {
    public HerbivorousFish(String name, int age, double energy, int speed) {
        super(name, age, energy, speed);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " fa: blub blub!");
    }
}

package AcquaticCreature;

public class Jellyfish extends AquaticCreature {
    public Jellyfish(String name, int age, double energy, int speed) {
        super(name, age, energy, speed);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " non emette suoni.");
    }
}
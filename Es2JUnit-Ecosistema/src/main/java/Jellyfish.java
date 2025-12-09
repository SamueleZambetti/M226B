public class Jellyfish extends AquaticCreature {
    public Jellyfish(String name, int age, double energy, int speed) {
        super(name, age, energy, speed);
    }

    @Override
    public String makeSound() {
        System.out.println(name + " non emette suoni.");
        return null;
    }
}
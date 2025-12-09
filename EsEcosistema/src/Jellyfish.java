public class Jellyfish extends AquaticCreature {
    // ...existing code...
    public Jellyfish(String name, int age, double energy, double speed) {
        super(name, age, energy, speed);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + ": (silenziosa)");
    }

    public void emitBioluminescence() {
        if (!isAlive()) return;
        System.out.println(getName() + " emette una luce bioluminescente!");
    }
}


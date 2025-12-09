public class Dolphin extends Predator {
    // ...existing code...
    public Dolphin(String name, int age, double energy, double speed, int ferocity, int intelligence) {
        super(name, age, energy, speed, ferocity, intelligence);
    }

    @Override
    public void makeSound() {
        System.out.println("Eee-eee-eee (click di delfino)");
    }

    public void play() {
        if (!isAlive()) return;
        System.out.println(getName() + " gioca e fa acrobazie!");
    }

    @Override
    public boolean hunt() {
        if (!isAlive()) return false;
        double score = ferocity * 0.25 + intelligence * 0.4 + getSpeed() * 0.2 + getEnergy() * 0.15;
        double chance = score / 220.0;
        boolean success = rnd.nextDouble() < chance;
        if (!success) {
            this.energy = Math.max(0, this.energy - 2);
            if (this.energy == 0) {
                this.alive = false;
                System.out.println("Caccia fallita, " + getName() + " è morto per mancanza di energia.");
            } else {
                System.out.println("Caccia fallita, la preda è sfuggita, nuovo livello di energia: " + this.energy);
            }
            return false;
        } else {
            System.out.println("Preda catturata");
            this.eat(20);
            return true;
        }
    }
}


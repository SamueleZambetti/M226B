public class Shark extends Predator {
    // ...existing code...
    public Shark(String name, int age, double energy, double speed, int ferocity) {
        super(name, age, energy, speed, ferocity, 20); // intelligenza bassa di default
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + ": Grrr (squalo)");
    }

    @Override
    public boolean hunt() {
        if (!isAlive()) return false;
        // probabilità piuttosto bassa di successo per simulare fallimenti frequenti
        double score = ferocity * 0.5 + getSpeed() * 0.3 + getEnergy() * 0.2;
        double chance = score / 200.0; // normalizza in [0, ~1]
        boolean success = rnd.nextDouble() < chance;
        if (!success) {
            // perde energia ad ogni tentativo fallito
            double newEnergy = getEnergy() - 3;
            // aggiornamento energia e possibile morte
            // uso eat(0) non adatto, quindi manipolo field protetto
            this.energy = Math.max(0, newEnergy);
            if (this.energy == 0) {
                this.alive = false;
                System.out.println("Caccia fallita, la preda è sfuggita, " + getName() + " è morto per mancanza di energia.");
            } else {
                System.out.println("Caccia fallita, la preda è sfuggita, nuovo livello di energia: " + this.energy);
            }
            return false;
        } else {
            System.out.println("Preda catturata");
            // guadagna energia
            this.eat(16);
            return true;
        }
    }
}


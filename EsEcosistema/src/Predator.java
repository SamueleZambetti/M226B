import java.util.Random;

public abstract class Predator extends AquaticCreature {
    // ...existing code...
    protected int ferocity;      // 0..100
    protected int intelligence;  // 0..100
    protected Random rnd = new Random();

    public Predator(String name, int age, double energy, double speed, int ferocity, int intelligence) {
        super(name, age, energy, speed);
        this.ferocity = Math.max(0, Math.min(100, ferocity));
        this.intelligence = Math.max(0, Math.min(100, intelligence));
    }

    public int getFerocity() { return ferocity; }
    public int getIntelligence() { return intelligence; }

    // Deve essere implementato nelle sottoclassi
    public abstract boolean hunt();
}


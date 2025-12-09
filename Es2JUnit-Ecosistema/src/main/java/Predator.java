

public abstract class Predator extends AquaticCreature {
    protected int ferocity;

    public Predator(String name, int age, double energy, int speed, int ferocity) {
        super(name, age, energy, speed);
        this.ferocity = ferocity;
    }

    public int getFerocity() { return ferocity; }
    public void setFerocity(int ferocity) { this.ferocity = ferocity; }

    public abstract boolean hunt();
}

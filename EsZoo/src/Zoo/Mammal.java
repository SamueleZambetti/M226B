package Zoo;
import Zoo.Animal;
public abstract class Mammal extends Animal {
    protected boolean hasFur;

    public Mammal(String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
    }
}

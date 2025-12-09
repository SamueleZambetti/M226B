package Predator;

public class Dolphin extends Predator {
    private int intelligence;

    public Dolphin(String name, int age, double energy, int speed, int ferocity, int intelligence) {
        super(name, age, energy, speed, ferocity);
        this.intelligence = intelligence;
    }

    public int getIntelligence() { return intelligence; }

    @Override
    public void makeSound() {
        System.out.println("Eee-eee-eee");
    }

    @Override
    public boolean hunt() {
        double random = Math.random() * 100;
        double chance = (energy + speed + ferocity + intelligence + random) / 5;
        if (chance > 60) {
            System.out.println("Preda catturata");
            eat();
            return true;
        } else {
            energy -= 3;
            if (energy <= 0) {
                System.out.println(name + " è morto di fame.");
            } else {
                System.out.println("Caccia fallita, energia: " + energy);
            }
            return false;
        }
    }

    @Override
    public void eat() {
        energy = Math.min(100, energy + 25);
        System.out.println(name + " si è appena nutrito. Nuovo livello di energia: " + energy);
    }

    public void play() {
        System.out.println(name + " gioca e fa acrobazie!");
    }
}

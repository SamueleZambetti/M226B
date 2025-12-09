package Predator;

public class Shark extends Predator {
    public Shark(String name, int age, double energy, int speed, int ferocity) {
        super(name, age, energy, speed, ferocity);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " fa: GRRRR!");
    }

    @Override
    public boolean hunt() {
        double random = Math.random() * 100;
        double chance = (energy + speed + ferocity + random) / 4;
        if (chance > 70) {
            System.out.println("Preda catturata");
            eat();
            return true;
        } else {
            energy -= 3;
            if (energy <= 0) {
                System.out.println(name + " è morto di fame.");
            } else {
                System.out.println("Caccia fallita, la preda è sfuggita, nuovo livello di energia: " + energy);
            }
            return false;
        }
    }

    @Override
    public void eat() {
        energy = Math.min(100, energy + 20);
        System.out.println(name + " si è appena nutrito. Nuovo livello di energia: " + energy);
    }
}

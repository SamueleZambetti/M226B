package Zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> zooAnimals = new ArrayList<>();

        zooAnimals.add(new Lion("Simba", 4, true));
        zooAnimals.add(new Elephant("Ella", 10, false));
        zooAnimals.add(new Parrot("Rio", 2));

        for (Animal animal : zooAnimals) {
            System.out.println("Classe: " + animal.getClass().getSimpleName());
            System.out.println("Nome: " + animal.name);
            System.out.println("Età: " + animal.age);

            System.out.println("Verso: " + animal.makeSound());

            if (animal instanceof Feedable) {

                if(animal instanceof Lion) {
                    ((Feedable) animal).eat("Michel");
                }
                else if(animal instanceof Elephant) {
                    ((Feedable) animal).eat("Banana");
                }
                else if(animal instanceof Parrot) {
                    ((Feedable) animal).eat("Semi");
                }

            }
        }
    }
}

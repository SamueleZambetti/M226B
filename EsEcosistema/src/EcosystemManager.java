import java.util.*;
import java.util.stream.*;

public class EcosystemManager {
    // ...existing code...
    private List<AquaticCreature> creatures = new ArrayList<>();

    public void addCreature(AquaticCreature c) {
        creatures.add(c);
    }

    public List<AquaticCreature> filterByEnergy(double minEnergy) {
        return creatures.stream()
                .filter(c -> c.getEnergy() > minEnergy)
                .collect(Collectors.toList());
    }

    public List<String> getAdultCreaturesNames(int minAge) {
        return creatures.stream()
                .filter(c -> c.getAge() >= minAge)
                .map(AquaticCreature::getName)
                .collect(Collectors.toList());
    }

    public List<Predator> findMostDangerousPredators(double minEnergy, int minFerocity) {
        return creatures.stream()
                .filter(c -> c instanceof Predator)
                .map(c -> (Predator) c)
                .filter(p -> p.getEnergy() >= minEnergy && p.getFerocity() >= minFerocity)
                .collect(Collectors.toList());
    }

    public void callAllPredatorsPolimorphicMethods(Predator p) {
        // metodi polimorfici: makeSound, move, eat, hunt
        p.makeSound();
        p.move();
        p.eat(10); // esempio di nutrimento
        boolean hunted = p.hunt();
        System.out.println(hunted);
    }

    public void callAllPredatorsInheritedMethods(Predator p) {
        // metodi ereditati da AquaticCreature: eat, getter/name/age/energy
        p.eat(25);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getEnergy());
        // includo anche hunt() ultimo valore booleano nell'esempio
        System.out.println(p.hunt());
    }

    public List<AquaticCreature> getAllCreatures() {
        return Collections.unmodifiableList(creatures);
    }
}


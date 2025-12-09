import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EcosystemManager {
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
        p.makeSound();
        boolean result = p.hunt();
        System.out.println(result);
    }

    public void callAllPredatorsInheritedMethods(Predator p) {
        p.eat();
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getEnergy());
        System.out.println(p.getFerocity() > 0);
    }

    public List<AquaticCreature> getCreatures() {
        return creatures;
    }

}

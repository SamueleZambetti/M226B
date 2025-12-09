import java.util.List;

public class MarineEcosystemSimulator {
    // ...existing code...
    public static void main(String[] args) {
        System.out.println("=== SIMULATORE ECOSISTEMA MARINO ===\n");
        EcosystemManager manager = new EcosystemManager();

        // Creazione creature (nomi ed energia simili all'esempio)
        Shark jaws = new Shark("Jaws", 5, 50.0, 8.0, 60);
        Dolphin flipper = new Dolphin("Flipper", 5, 75.0, 9.0, 40, 80);
        Shark finny = new Shark("Finny", 4, 70.0, 9.5, 90);
        Dolphin echo = new Dolphin("Echo", 3, 65.0, 8.5, 45, 70);
        HerbivorousFish dory = new HerbivorousFish("Dory", 3, 30.0, 3.0);
        HerbivorousFish nemo = new HerbivorousFish("Nemo", 1, 30.0, 2.0);
        Jellyfish lumina = new Jellyfish("Lumina", 2, 40.0, 1.0);

        manager.addCreature(jaws);
        manager.addCreature(flipper);
        manager.addCreature(finny);
        manager.addCreature(echo);
        manager.addCreature(dory);
        manager.addCreature(nemo);
        manager.addCreature(lumina);

        // 1. filterByEnergy > 50
        System.out.println("**** 1. Creature con energia > 50:");
        List<AquaticCreature> strong = manager.filterByEnergy(50);
        strong.forEach(c -> System.out.println(" - " + c.getName() + " (" + c.getEnergy() + ")"));
        System.out.println();

        // 2. adult creatures age >= 3
        System.out.println("**** 2. Creature con età >= 3:");
        manager.getAdultCreaturesNames(3).forEach(n -> System.out.println(" - " + n));
        System.out.println();

        // 3. most dangerous predators (esempio: energia >= 60, ferocia >= 80 -> Finny)
        System.out.println("**** 3. Predatori più pericolosi:");
        manager.findMostDangerousPredators(60, 80).forEach(p -> System.out.println(" - " + p.getName()));
        System.out.println();

        // 4. callAllPredatorsPolimorphicMethods su Flipper
        System.out.println("**** 4. Invoca tutti i metodi polimorfici di un predatore:");
        manager.callAllPredatorsPolimorphicMethods(flipper);
        System.out.println();

        // 5. callAllPredatorsInheritedMethods su Flipper
        System.out.println("**** 5. Invoca tutti i metodi ereditati di un predatore:");
        manager.callAllPredatorsInheritedMethods(flipper);
        System.out.println();

        // 6. far muovere Nemo finché non muore
        System.out.println("**** 6. Fai muovere una creatura finché non muore:");
        while (nemo.isAlive()) {
            nemo.move();
        }
        System.out.println();

        // 7. comportamenti specifici
        System.out.println("**** 7. Comportamenti specifici:");
        for (AquaticCreature c : manager.getAllCreatures()) {
            if (c instanceof Dolphin) {
                ((Dolphin) c).play();
            } else if (c instanceof Jellyfish) {
                ((Jellyfish) c).emitBioluminescence();
            }
        }
        System.out.println();

        // 8. far cacciare uno squalo (Jaws) finché non riesce a mangiare o muore
        System.out.println("**** 8. Fai cacciare uno squalo finché non riesce a mangiare:");
        boolean ate = false;
        while (jaws.isAlive() && !ate) {
            ate = jaws.hunt();
        }
    }
}


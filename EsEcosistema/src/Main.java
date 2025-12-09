import AcquaticCreature.*;
import Predator.*;
import EcosystemManager.EcosystemManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIMULATORE ECOSISTEMA MARINO ===\n");

        EcosystemManager manager = new EcosystemManager();

        Shark jaws = new Shark("Jaws", 5, 50, 20, 80);
        Dolphin flipper = new Dolphin("Flipper", 5, 75, 25, 60, 80);
        HerbivorousFish nemo = new HerbivorousFish("Nemo", 2, 30, 10);
        Jellyfish lumina = new Jellyfish("Lumina", 1, 60, 5);
        Dolphin echo = new Dolphin("Echo", 3, 65, 22, 55, 70);
        HerbivorousFish dory = new HerbivorousFish("Dory", 3, 70, 15);
        Shark finny = new Shark("Finny", 4, 70, 18, 75);

        manager.addCreature(jaws);
        manager.addCreature(flipper);
        manager.addCreature(nemo);
        manager.addCreature(lumina);
        manager.addCreature(echo);
        manager.addCreature(dory);
        manager.addCreature(finny);

        System.out.println("**** 1. Creature con energia > 50:");
        manager.filterByEnergy(50).forEach(c ->
                System.out.println(" - " + c.getName() + " (" + c.getEnergy() + ")"));
        System.out.println();


        System.out.println("**** 2. Creature con età >= 3:");
        manager.getAdultCreaturesNames(3).forEach(name ->
                System.out.println(" - " + name));
        System.out.println();

        System.out.println("**** 3. Predatori più pericolosi:");
        manager.findMostDangerousPredators(60, 70).forEach(p ->
                System.out.println(" - " + p.getName()));
        System.out.println();

        System.out.println("**** 4. Invoca tutti i metodi polimorfici di un predatore:");
        manager.callAllPredatorsPolimorphicMethods(flipper);
        System.out.println();

        System.out.println("**** 5. Invoca tutti i metodi ereditati di un predatore:");
        manager.callAllPredatorsInheritedMethods(flipper);
        System.out.println();

        System.out.println("**** 6. Fai muovere una creatura finché non muore:");
        while (nemo.getEnergy() > 0) {
            nemo.move();
        }
        System.out.println();

        System.out.println("**** 7. Comportamenti specifici:");
        for (var c : manager.getCreatures()) {
            if (c instanceof Dolphin d) d.play();
            else if (c instanceof Jellyfish) System.out.println(c.getName() + " emette una luce bioluminescente!");
        }
        System.out.println();

        System.out.println("**** 8. Fai cacciare uno squalo finché non riesce a mangiare:");
        boolean success = false;
        while (!success && jaws.getEnergy() > 0) {
            success = jaws.hunt();
        }
        System.out.println();
    
    }
}

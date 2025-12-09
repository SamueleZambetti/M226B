UML Class Diagram (testuale)

AquaticCreature
- name: String
- age: int
- energy: double
- speed: double
- alive: boolean
+ makeSound()
+ move()
+ eat(amount)
+ getName(), getAge(), getEnergy(), isAlive()

Predator extends AquaticCreature
- ferocity: int
- intelligence: int
+ hunt()

HerbivorousFish extends AquaticCreature
+ makeSound()

Jellyfish extends AquaticCreature
+ makeSound()
+ emitBioluminescence()

Shark extends Predator
+ makeSound()
+ hunt()

Dolphin extends Predator
+ makeSound()
+ play()
+ hunt()

EcosystemManager
- creatures: List<AquaticCreature>
+ addCreature(...)
+ filterByEnergy(...)
+ getAdultCreaturesNames(...)
+ findMostDangerousPredators(...)
+ callAllPredatorsPolimorphicMethods(...)
+ callAllPredatorsInheritedMethods(...)


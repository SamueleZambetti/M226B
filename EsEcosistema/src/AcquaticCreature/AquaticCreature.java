package AcquaticCreature;

import Interfaccie.Creature;

public abstract class AquaticCreature implements Creature {
    protected String name;
    protected int age;
    protected double energy; // 0–100
    protected int speed;

    public AquaticCreature(String name, int age, double energy, int speed) {
        this.name = name;
        this.age = age;
        this.energy = energy;
        this.speed = speed;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getEnergy() { return energy; }
    public void setEnergy(double energy) { this.energy = Math.max(0, Math.min(100, energy)); }
    public int getSpeed() { return speed; }

    @Override
    public void move() {
        if (energy <= 0) {
            System.out.println(name + " è morto e non può muoversi.");
            return;
        }
        energy -= 2;
        if (energy <= 0) {
            energy = 0;
            System.out.println(name + " è morto");
        } else {
            System.out.println(name + " si muove nell'acqua");
        }
    }

    @Override
    public void eat() {
        energy = Math.min(100, energy + 10);
        System.out.println(name + " si è nutrito. Energia: " + energy);
    }

    @Override
    public abstract void makeSound();
}

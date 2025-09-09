package main.fourwheels;

import main.Veicolo;

import java.util.Objects;

public class Camion extends Veicolo {
    private double capacitaMassimaCarico;

    public Camion(String targa, String marca, String modello, int numeroPosti, double capacitaMassimaCarico) {
        super(targa, marca, modello, numeroPosti);
        this.capacitaMassimaCarico = capacitaMassimaCarico;
    }

    public double getCapacitaMassimaCarico() {
        return capacitaMassimaCarico;
    }

    public void setCapacitaMassimaCarico(double capacitaMassimaCarico) {
        this.capacitaMassimaCarico = capacitaMassimaCarico;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "capacitaMassimaCarico=" + capacitaMassimaCarico +
                ", " + super.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Camion camion = (Camion) o;
        return Double.compare(camion.capacitaMassimaCarico, capacitaMassimaCarico) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacitaMassimaCarico);
    }
}

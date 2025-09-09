package main.fourwheels;

import main.Veicolo;

public class Auto extends Veicolo {
    private int numeroPorte;

    public Auto(String targa, String marca, String modello, int numeroPosti, int numeroPorte) {
        super(targa, marca, modello, numeroPosti);
        this.numeroPorte = numeroPorte;
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "numeroPorte=" + numeroPorte +
                ", " + super.toString() +
                '}';
    }
}

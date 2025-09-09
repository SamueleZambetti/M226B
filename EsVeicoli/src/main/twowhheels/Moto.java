package main.twowheels;

import main.Veicolo;

public final class Moto extends Veicolo {
    private String tipo;

    public Moto(String targa, String marca, String modello, int numeroPosti, String tipo) {
        super(targa, marca, modello, numeroPosti);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void faiRumore() {
        System.out.println("Brum brum");
    }

    @Override
    public String toString() {
        return "Moto{" +
                "tipo='" + tipo + '\'' +
                ", " + super.toString() +
                '}';
    }
}

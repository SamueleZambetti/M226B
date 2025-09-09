package main;

import java.util.Objects;

public class Veicolo {
    private String targa;
    private String marca;
    private final String modello; // non modificabile dopo creazione
    private int numeroPosti;

    public Veicolo(String targa, String marca, String modello, int numeroPosti) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.numeroPosti = numeroPosti;
    }

    // Metodo faiRumore() in cima, stampa rumore base
    public void faiRumore() {
        System.out.println("Wruuuum");
    }

    // Getter e setter
    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    public void setNumeroPosti(int numeroPosti) {
        this.numeroPosti = numeroPosti;
    }

    // toString(), equals(), hashCode() generati (IDEA, versione base)
    @Override
    public String toString() {
        return "Veicolo{" +
                "targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", numeroPosti=" + numeroPosti +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Veicolo)) return false;
        Veicolo veicolo = (Veicolo) o;
        return numeroPosti == veicolo.numeroPosti &&
                Objects.equals(targa, veicolo.targa) &&
                Objects.equals(marca, veicolo.marca) &&
                Objects.equals(modello, veicolo.modello);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targa, marca, modello, numeroPosti);
    }
}

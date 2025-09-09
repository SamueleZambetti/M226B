package main;

import main.fourwheels.Camion;
import main.twowheels.Moto;

public class Main {
    public static void main(String[] args) {
        Camion camion = new Camion("AB123CD", "Volvo", "FH16", 2, 25000.0);
        Moto moto = new Moto("XY987ZT", "Yamaha", "YZF-R3", 1, "Sport");

        System.out.print("Rumore camion: ");
        camion.faiRumore();

        System.out.print("Rumore moto: ");
        moto.faiRumore();
    }
}

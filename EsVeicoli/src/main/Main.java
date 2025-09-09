import main.fourwheels.Camion;
import main.twowheels.Moto;
import mechanics.Motore;

public class Main {
    public static void main(String[] args) {
        Camion camion = new Camion("AB123CD", "Volvo", "FH16", 2, 25000);
        Moto moto = new Moto("XY987ZT", "Honda", "CBR600RR", 2, "Sport");

        Motore motoreMoto = new Motore("SN123456789", "CBR Engine V2");
        moto.setMotore(motoreMoto);

        System.out.print("Rumore Camion: ");
        camion.faiRumore();

        System.out.print("Rumore Moto: ");
        moto.faiRumore();

        System.out.println("Motore della moto: " + moto.getMotore());
    }
}

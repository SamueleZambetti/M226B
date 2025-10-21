package service;

import main.fourwheels.Auto;
import main.interfaces.Riparabile;

import java.util.ArrayList;
import java.util.List;

public class Officina  {
    public List<Riparabile>veicolinRiparazione = new ArrayList<>();

    public void accettaVeicolo(Riparabile veicolo){
        veicolinRiparazione.add(veicolo);
    }
    public void stampaSchedarioRiparazioni(){
        for(Riparabile r: veicolinRiparazione){
            System.out.print(r);
            System.out.println(r.calcolaCostoRiparazione(10));
        }
    }
}

package service;

import main.interfaces.Assicurabile;

import java.util.HashSet;
import java.util.Set;

public class AgenziaAssicurativa {
    Set<Assicurabile> veicoliAssicurati = new HashSet<>();

    public void aggiungiVeicolo(Assicurabile assicurabile){
        veicoliAssicurati.add(assicurabile);
    }
    
}

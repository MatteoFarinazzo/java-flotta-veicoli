package org.java.FlottaVeicoli;

import java.util.List;

public class GestoreFlotta {

    private List <Veicolo> listaVeicoli;


     //metodi

    public void addNewVeicolo (Veicolo nuovoVeicolo){
        listaVeicoli.add(nuovoVeicolo);
    }

    public Veicolo findVeicle (String targa){
        Veicolo finded = null;
        for (Veicolo veicolo : listaVeicoli){
            if (veicolo.getTarga().equals(targa)){
                finded = veicolo;
            }
        }
        return finded;
    }

    public String getSpecificTypeNum (){
        int counterAuto = 0;
        int counterMoto = 0;
        String response = null;
        for (Veicolo veicolo : listaVeicoli){
            if(veicolo instanceof Automobile){
                counterAuto ++;
            } else if (veicolo instanceof Motociclette){
                counterMoto ++;
            }
        }
        return response += "I veicoli di tipo automobile sono: " + counterAuto + ", mentre i veicoli di tipo motociclo sono: " + counterMoto;
    }

}

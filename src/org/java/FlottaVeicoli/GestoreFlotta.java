package org.java.FlottaVeicoli;

import java.util.ArrayList;
import java.util.List;

public class GestoreFlotta {

    private List <Veicolo> listaVeicoli;

    //costruttore
    public GestoreFlotta() {
        listaVeicoli = new ArrayList<>();
    }

    //getter setter

    public List<Veicolo> getListaVeicoli() {
        return listaVeicoli;
    }

    public void setListaVeicoli(List<Veicolo> listaVeicoli) {
        this.listaVeicoli = listaVeicoli;
    }


    //metodi

    public void addNewVeicolo (Veicolo nuovoVeicolo){

        for (Veicolo veicolo : listaVeicoli){
            if (veicolo.getTarga().equals(nuovoVeicolo.getTarga())){
                System.out.println("Hey! Un veicolo con questa targa è già presente!");
                return;
            }
        }
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

    private int counterAuto = 0;
    private int counterMoto = 0;
    public String getSpecificTypeNum (){

        String response = null;
        for (Veicolo veicolo : listaVeicoli){
            if(veicolo instanceof Automobile){
                counterAuto ++;
            } else if (veicolo instanceof Motociclette){
                counterMoto ++;
            }
        }
        return response = "I veicoli di tipo automobile sono: " + counterAuto + ", mentre i veicoli di tipo motociclo sono: " + counterMoto;
    }

}

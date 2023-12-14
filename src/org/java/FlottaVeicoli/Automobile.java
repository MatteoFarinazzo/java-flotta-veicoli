package org.java.FlottaVeicoli;

public class Automobile extends Veicolo{

    private int numPorte;

    public Automobile(String targa, int annoImmatricolazione, int numPorte) {
        super(targa, annoImmatricolazione);
        this.numPorte = numPorte;
    }

    public int getNumPorte() {
        return numPorte;
    }

    public void setNumPorte(int numPorte) {
        this.numPorte = numPorte;
    }

    @Override
    public String toString() {
        return super.toString() + ", questo modello ha: " + getNumPorte() + " porte";
    }
}

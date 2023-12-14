package org.java.FlottaVeicoli;

public abstract class Veicolo {

    private String targa;
    private int annoImmatricolazione;

    //costruttore

    public Veicolo(String targa, int annoImmatricolazione) {
        this.targa = targa;
        this.annoImmatricolazione = annoImmatricolazione;
    }

    //getter setter


    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }

    public void setAnnoImmatricolazione(int annoImmatricolazione) {
        this.annoImmatricolazione = annoImmatricolazione;
    }


    //metodi


    @Override
    public String toString() {
        return "Il veicolo con la targa inserita è: " + getTarga() + " " + getAnnoImmatricolazione();
    }
}

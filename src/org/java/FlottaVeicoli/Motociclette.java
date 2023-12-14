package org.java.FlottaVeicoli;

public class Motociclette extends Veicolo{

    private boolean cavalletto;

    public Motociclette(String targa, int annoImmatricolazione) {
        super(targa, annoImmatricolazione);
    }

    //getter setter


    public boolean isCavalletto() {
        return cavalletto;
    }

    public void setCavalletto(boolean cavalletto) {
        this.cavalletto = cavalletto;
    }
}

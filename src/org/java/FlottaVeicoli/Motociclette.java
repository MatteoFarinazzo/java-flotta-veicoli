package org.java.FlottaVeicoli;

public class Motociclette extends Veicolo{

    private boolean cavalletto;

    public Motociclette(String targa, int annoImmatricolazione, boolean cavalletto) {
        super(targa, annoImmatricolazione);
        this.cavalletto = cavalletto;
    }

    //getter setter


    public boolean isCavalletto() {
        return cavalletto;
    }

    public String haveCavalletto (){
        String cavalle = null;
        if (cavalletto){
            cavalle = " ed ha il cavalletto";
        } else {cavalle = " e non ha il cavalletto";}
        return cavalle;
    }

    public void setCavalletto(boolean cavalletto) {
        this.cavalletto = cavalletto;
    }

    @Override
    public String toString() {
        return super.toString() + haveCavalletto() ;
    }
}

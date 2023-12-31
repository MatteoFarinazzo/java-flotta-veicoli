package org.java.FlottaVeicoli;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GestoreFlotta flotta = new GestoreFlotta();

        Automobile rossa = new Automobile("ST231BG", 2007, 3);
        flotta.addNewVeicolo(rossa);
        Automobile incredibile = new Automobile("AR946TE", 2021, 5);
        flotta.addNewVeicolo(incredibile);
        Motociclette veloce = new Motociclette("HD648RT",2009, true);
        flotta.addNewVeicolo(veloce);

        //provo ad aggiungere una targa già presente
        Motociclette vekhb = new Motociclette("HD648RT",2009, true);
        flotta.addNewVeicolo(vekhb);

        //stampo un veicolo con specifica targa
        System.out.println(flotta.findVeicle("HD648RT"));

        //conto il numero di veicoli distinti per tipologia
        System.out.println(flotta.getSpecificTypeNum());


        scanner.close();
    }
}

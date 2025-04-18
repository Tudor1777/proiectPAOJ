package main.service;

import main.classes.*;

import java.util.Comparator;
import java.util.List;

public class ServiciuTranzactii {
    public void transfer(ContBancar sursa, ContBancar destinatie, double suma) {
        sursa.retragere(suma);
        destinatie.depunere(suma);
        sursa.getTranzactii().add(new Tranzactie("Transfer iesire", suma, sursa, destinatie));
        destinatie.getTranzactii().add(new Tranzactie("Transfer intrare", suma, sursa, destinatie));
    }

    public void afiseazaTranzactiiSortate(ContBancar cont) {
        List<Tranzactie> tranzactii = cont.getTranzactii();
        tranzactii.sort(Comparator.comparing(Tranzactie::getData));
        for (Tranzactie t : tranzactii) {
            System.out.println(t.getData() + " | " + t.getTip() + " | " + t.getSuma());
        }
    }
}


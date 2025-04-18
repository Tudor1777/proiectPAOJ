package main;

import main.classes.*;
import main.service.*;

public class Main {
    public static void main(String[] args) {
        ServiciuConturi serviciuConturi = new ServiciuConturi();
        ServiciuTranzactii serviciuTranzactii = new ServiciuTranzactii();
        ServiciuCarduri serviciuCarduri = new ServiciuCarduri();

        Client client1 = new Client("Ticu", "Tudor", "1111111111111", "andrei@example.com");
        serviciuConturi.adaugaClient(client1);

        ContBancar cont1 = new ContCurent("RO01BANK0000000001");
        ContBancar cont2 = new ContEconomii("RO01BANK0000000002", 2.5);

        serviciuConturi.deschideCont("1111111111111", cont1);
        serviciuConturi.deschideCont("1111111111111", cont2);

        serviciuConturi.afiseazaConturiClient("1111111111111");

        cont1.depunere(1000);
        serviciuTranzactii.transfer(cont1, cont2, 250);
        serviciuTranzactii.afiseazaTranzactiiSortate(cont1);

        Card card1 = new CardDebit("1234-5678-9012-3456", client1, "12/2027", 111);
        Card card2 = new CardCredit("4321-8888-2109-2929", client1, "12/2027", 500, 1000);

        serviciuCarduri.adaugaCard(card1);
        serviciuCarduri.adaugaCard(card2);
        serviciuCarduri.afiseazaCarduri(client1);
    }
}
package main.service;

import main.classes.*;

import javax.xml.transform.Source;
import java.util.HashSet;
import java.util.Set;

public class ServiciuCarduri {
    private Set<Card> carduri;

    public ServiciuCarduri() {
        this.carduri = new HashSet<>();
    }

    public void adaugaCard(Card card) {
        carduri.add(card);
    }

    public void afiseazaCarduri(Client client) {
        System.out.println("Cardurile clientului:" + client.getNume() + " " + client.getPrenume());
        for (Card card : carduri) {
            if (card.getTitular().equals(client)) {
                System.out.println(card.getTipCard() + " | " + card.getNumar());
            }
        }
    }
}

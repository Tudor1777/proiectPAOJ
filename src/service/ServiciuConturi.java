package main.service;

import main.classes.*;

import java.util.HashMap;
import java.util.Map;

public class ServiciuConturi {
    private Map<String, Client> clienti;

    public ServiciuConturi() {
        clienti = new HashMap<>();
    }

    public void adaugaClient(Client client) {
        clienti.put(client.getCNP(), client);
    }

    public Client cautaClientDupaCnp(String cnp) {
        return clienti.get(cnp);
    }

    public void afiseazaConturiClient(String cnp) {
        Client client = clienti.get(cnp);
        if (client != null) {
            client.afiseazaConturi();
        } else {
            System.out.println("Client inexistent.");
        }
    }
    public void deschideCont(String cnp, ContBancar cont) {
        Client client = clienti.get(cnp);
        if (client != null) {
            client.adaugaCont(cont);
            System.out.println("Cont deschis pentru clientul " + client.getNume() + ": " + cont.getIban());
        } else {
            System.out.println("Client inexistent pentru CNP: " + cnp);
        }
    }

}


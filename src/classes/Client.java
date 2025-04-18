package main.classes;
import java.util.ArrayList;
import java.util.List;

public class Client extends Utilizator{
    private List<ContBancar> conturi;

    public Client(String nume, String prenume, String cnp, String email) {
        super(nume, prenume, cnp, email);
        this.conturi = new ArrayList<>();
    }

    public void adaugaCont(ContBancar cont) {
        conturi.add(cont);
    }

    public List<ContBancar> getConturi() {
        return conturi;
    }
    public void afiseazaConturi() {
        System.out.println("Conturi pentru clientul " + getNume() + ":");
        for (ContBancar cont : conturi) {
            System.out.println("- " + cont.getTipCont() + " | IBAN: " + cont.getIban() + " | Sold: " + cont.getSold());
        }
    }
}

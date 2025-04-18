package main.classes;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class ContBancar {
    protected String iban;
    protected double sold;
    protected LocalDate dataDeschidere;
    protected List<Tranzactie> tranzactii;

    public ContBancar(String iban) {
        this.iban = iban;
        this.sold = 0.0;
        this.dataDeschidere = LocalDate.now();
        this.tranzactii = new ArrayList<>();
    }

    public String getIban() {
        return iban;
    }

    public double getSold() {
        return sold;
    }

    public LocalDate getDataDeschidere() {
        return dataDeschidere;
    }

    public List<Tranzactie> getTranzactii() {
        return tranzactii;
    }

    public void depunere(double suma) {
        if (suma <= 0) throw new IllegalArgumentException("Suma trebuie sa fie pozitiva.");
        this.sold += suma;
        tranzactii.add(new Tranzactie("Depunere", suma, this, null));
    }

    public void retragere(double suma) {
        if (suma <= 0) throw new IllegalArgumentException("Suma trebuie sa fie pozitiva.");
        if (suma > sold) throw new IllegalArgumentException("Fonduri insuficiente.");
        this.sold -= suma;
        tranzactii.add(new Tranzactie("Retragere", suma, this, null));
    }

    public abstract String getTipCont();
}

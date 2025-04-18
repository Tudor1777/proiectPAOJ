package main.classes;

import java.time.LocalDateTime;

public class Tranzactie {
    private String tip;
    private double suma;
    private LocalDateTime data;
    private ContBancar contSursa;
    private ContBancar contDestinatie;

    public Tranzactie(String tip, double suma, ContBancar contSursa, ContBancar contDestinatie) {
        this.tip = tip;
        this.suma = suma;
        this.data = LocalDateTime.now();
        this.contSursa = contSursa;
        this.contDestinatie = contDestinatie;
    }

    public String getTip() {
        return tip;
    }

    public double getSuma() {
        return suma;
    }

    public LocalDateTime getData() {
        return data;
    }

    public ContBancar getContSursa() {
        return contSursa;
    }

    public ContBancar getContDestinatie() {
        return contDestinatie;
    }
}
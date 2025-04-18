package main.classes;

public abstract class Card {
    protected String numar;
    protected Client titular;
    protected String dataExpirare;
    protected int CVV;

    public Card(String numar, Client titular, String dataExpirare, int CVV) {
        this.numar = numar;
        this.titular = titular;
        this.dataExpirare = dataExpirare;
        this.CVV = CVV;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public String getNumar() {
        return numar;
    }

    public Client getTitular() {
        return titular;
    }

    public String getDataExpirare() {
        return dataExpirare;
    }

    public abstract String getTipCard();
}

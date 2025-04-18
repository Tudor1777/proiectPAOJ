package main.classes;

public class ContEconomii extends ContBancar {
    private double rataDobanda;

    public ContEconomii(String iban, double rataDobanda) {
        super(iban);
        this.rataDobanda = rataDobanda;
    }

    public double getRataDobanda() {
        return rataDobanda;
    }

    @Override
    public String getTipCont() {
        return "Cont Economii";
    }
}

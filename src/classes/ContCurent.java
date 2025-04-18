package main.classes;

public class ContCurent extends ContBancar {
    public ContCurent(String iban) {
        super(iban);
    }

    @Override
    public String getTipCont() {
        return "Cont Curent";
    }
}

package main.classes;

public class CardCredit extends Card {
    private double limitaCredit;
    private double datorieCurenta;
    public CardCredit(String numar, Client titular, String dataExpirare, int CVV, double limitaCredit) {
        super(numar, titular, dataExpirare, CVV);
        this.limitaCredit = limitaCredit;
        this.datorieCurenta = 0;
    }
    public double getLimitaCredit() {
        return limitaCredit;
    }

    public double getDatorieCurenta() {
        return datorieCurenta;
    }

    public boolean cheltuieste(double suma) {
        if (suma <= 0) return false;
        if (datorieCurenta + suma > limitaCredit) return false;
        datorieCurenta += suma;
        return true;
    }

    public void platesteDatorie(double suma) {
        if (suma <= 0) throw new IllegalArgumentException("Suma invalida.");
        datorieCurenta -= suma;
        if (datorieCurenta < 0) datorieCurenta = 0;
    }

    @Override
    public String getTipCard() {
        return "Card Credit";
    }
}

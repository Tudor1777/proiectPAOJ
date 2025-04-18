package main.classes;

public class CardDebit extends Card {
    public CardDebit(String numar, Client titular, String dataExpirare, int CVV) {
        super(numar, titular, dataExpirare, CVV);
    }

    @Override
    public String getTipCard() {
        return "Card Debit";
    }
}
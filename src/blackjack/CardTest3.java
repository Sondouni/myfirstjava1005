package blackjack;

import ch06.Car;

public class CardTest3 {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();

        Card c1 = new Card("A","7");
        Card c2 = new Card("A","10");

        dealer.receiveCard(c1);
        dealer.receiveCard(c2);

        dealer.moreCard(cd);
        dealer.showAllMyCards();
    }
}

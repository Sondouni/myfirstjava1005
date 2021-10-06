package blackjack;

import ch06.Car;

public class CardTest2 {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        for(int i =0;i<6;i++) {
//            Card c = cd.getCard();
//            System.out.println(c);
//
//            gamer.receiveCard(c);
            gamer.receiveCard(cd.getCard());
        }
        System.out.println("---------------");
//        cd.showAllCards();
        System.out.println("---------------");
        System.out.println((new CardDeck()).getCard());
    }
}

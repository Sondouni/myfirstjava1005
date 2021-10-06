package blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardTest {
    public static void main(String[] args) {
        Card c1 = new Card("Spade","A");
//        System.out.println(sa.getPattern()+sa.getDenomination());   -> 배열,ArrayList로 가능
        List<Card> cards = new ArrayList(); //제네릭 generic?<><><>? <타입선언> 하는이유? 빼서 쓰는
        cards.add(new Card("스페이드","A"));

//        System.out.println(c1);

        CardDeck cd = new CardDeck();
        cd.showAllCards();
        System.out.println();
        System.out.println(cd.getCard());
        System.out.println();
        cd.showAllCards();
    }
}

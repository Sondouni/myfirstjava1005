package blackjack;

import java.util.LinkedList;
import java.util.List;

public class Gamer {
    //배열은 별로, 카드가 몇장이 들어올지 모름

//    private Card[] myCard = new Card[20]; 배열은 고정값이라
//    인덱스를 추가적으로 넣을수있는 List,ArrayList가 좋다
    protected List<Card> myCards;
    public Gamer(){
        init();
    }
    private void init(){
        myCards = new LinkedList<>();
    }
    //카드받기
    public void receiveCard(Card c){
        myCards.add(c);
    }
    public List<Card> openCards(){
        return myCards;
    }
    public void showAllMyCards(){
        for(Card c:myCards){
            System.out.println(c);
        }
    }
}

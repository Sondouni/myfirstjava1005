package blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private List<Card> cards;
    private final String[] cardKind = {"Heart","Diamond","Clover","Spade"};
    private final String[] cardNum = {"A","2","3","4","5","6","7","8","9","10",
    "J","Q","K"};

    public CardDeck(){
        cardMaking();
    }
    public void cardMaking(){
        cards=new ArrayList();
        for(int i = 0;i<cardKind.length;i++){
            for(int k = 0;k<cardNum.length;k++){
//                String denomination = String.valueOf(k);
//                switch (k){
//                    case 1:
//                        denomination = "A";
//                        break;
//                    case 11:
//                        denomination = "J";
//                        break;
//                    case 12:
//                        denomination = "Q";
//                        break;
//                    case 13:
//                        denomination = "K";
//                        break;
//
//                }
                cards.add(new Card(cardKind[i],cardNum[k]));
            }
        }
    }
    public Card getCard(){
        //배열로 만들었다면, 먼저 섞고 순차적으로 카드를 준다
        //ArrayList로 해서 랜덤하게 카드를 줄것이다.
        int rIdx = (int)(Math.random()*cards.size());
        return cards.remove(rIdx);

//        return cards.remove((int)(Math.random()*cards.size()));
    }
    public void showAllCards(){
//        for(int i =0;i<cards.size();i++){
//            Card c = cards.get(i);
//            System.out.println(c);
//        }
        //플렉션? 배열같이 순서가 있는(인덱스가 있는) 객체는 for each문, 향상된 for문사용가능
        for(Card c : cards){
            System.out.println(c);
        }
    }
}

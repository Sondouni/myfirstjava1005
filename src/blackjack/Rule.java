package blackjack;

import java.util.List;

public class Rule {
    public int getScore(List<Card> cards){
        int sumPoint = 0;
        for(int i=0;i<cards.size();i++){
            sumPoint += cards.get(i).getPoint();
        }
        return  sumPoint;
    }
    public void getWinner(Dealer dealer, Gamer gamer){
        int dealerScore=getScore(dealer.openCards());
        int gamerScore=getScore(gamer.openCards());

        System.out.println("dealerscore : "+dealerScore);
        System.out.println("gamerscore : "+gamerScore);
        final int STAND_SCORE =21;
        if(dealerScore==gamerScore||(dealerScore>STAND_SCORE&&gamerScore>STAND_SCORE)){
            System.out.println("비겼습니다.");
        }else if((STAND_SCORE-dealerScore)>(STAND_SCORE-gamerScore)||(dealerScore>STAND_SCORE)){
            System.out.println("게이머 승리");
        }else if((STAND_SCORE-dealerScore)<(STAND_SCORE-gamerScore)||(gamerScore>STAND_SCORE)){
            System.out.println("딜러 승리");
        }
    }
}

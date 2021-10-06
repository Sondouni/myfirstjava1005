package blackjack;

public class CardTest4 {
    public static void main(String[] args) {
        //JUnit(테스트 도구)
        Rule rule = new Rule();
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        for(int i=0;i<2;i++){
            dealer.receiveCard(cd.getCard());
            gamer.receiveCard(cd.getCard());
        }
        dealer.moreCard(cd);
        dealer.showAllMyCards();
        gamer.showAllMyCards();
        System.out.println("===============");
        rule.getWinner(dealer,gamer);
    }
}

package blackjack;

public class Card {
    final int CARDKIND=4;
    final int CARDNUM=13;
    private String pattern;         //무늬
    private String denomination;    //숫자,값
    public Card(Card c){
        this.pattern=c.pattern;
        this.denomination = c.denomination;
    }
    public Card(String pattern, String denomination){
        this.pattern = pattern;
        this.denomination = denomination;
    }
    public String getPattern(){
        return this.pattern;
    }
    public String getDenomination(){
        return this.denomination;
    }
    public int getPoint(){
        //denomination 값이 "A"->1
        //"2" = > .....점수를 해달라
        if(denomination=="A"){
            return 1;
        }else if(denomination=="J"||denomination=="Q"||denomination=="K") {
            return 10;
        }else{
            return Integer.parseInt(denomination);
        }
        //switch문 생각
    }
    public String toString(){
//        return pattern+" - "+denomination;
        return String.format("%s - %s",this.pattern,this.denomination);
    }
}

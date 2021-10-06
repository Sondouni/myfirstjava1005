package blackjack;

public class CTest {
    public static void main(String[] args) {
        Card c = new Card("클로버","2");
        Card c1 = new Card("클로버","3");
        Card c2 = new Card("클로버","A");
        Card c3 = new Card("클로버","7");
        Card c4 = new Card("클로버","J");

        System.out.println(c.getPoint());
        System.out.println(c1.getPoint());
        System.out.println(c2.getPoint());
        System.out.println(c3.getPoint());
        System.out.println(c4.getPoint());
    }
}

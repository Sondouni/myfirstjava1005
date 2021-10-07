package exam211007;
/*
- 클래스명 CardMain

- 1.3 문항에서 생성한 Card 클래스를 활용

- 카드 모양(shape) : spade, heart, diamond, clover

- 카드 값(value) : A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K

- [2점] main 메소드 작성 (아래 요구사항을 수행)

- [3점] 카드 객체를 담을 배열 생성

- [5점] 각 카드 모양에 모든 카드 값을 갖는 Card 객체를 생성한다. (총 52개의 카드 객체)

- [4점] 배열에 모든 카드 객체를 담는다.
 */

public class CardMain {
    public static void main(String[] args) {
//        4번문제
        Card card[] = new Card[52];
        final int CARDNUM = 13;
        int count = 0;
        String shape[] = {"spade","heart","diamond","clover"};
        for(int i = 0;i<shape.length;i++){
            for (int k = 1;k<=CARDNUM;k++){
                String value;
                switch (k){
                    case 1:
                        value = "A";
                        break;
                    case 11:
                        value = "J";
                        break;
                    case 12:
                        value = "Q";
                        break;
                    case 13:
                        value = "K";
                        break;
                    default:
                        value = String.valueOf(k);
                }
                card[count++] = new Card(shape[i],value);
            }
        }
//        5번문제
        for(int i=0;i<52;i++){
            System.out.println(card[i]);
        }
        Card c1 = new Card("spade", "K");
        System.out.println(c1);
        Card c2 = new Card("heart", "2");
        System.out.println(c2);
        System.out.println(count);
    }
}

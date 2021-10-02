package ch02;


public class VariableExample {
    public static void main(String[] args) {//main method 프로그램의 시발점
        int score;
        score =10;//오른쪽에 값을 복사하여 왼쪽에준다
        System.out.println(score);
        System.out.println(10);

        score =20;
        System.out.println(score);
        System.out.println(20);


        System.out.println(score+score);
        System.out.println(score);

        score = score+score+score;
        System.out.println(score);

        score += score;

        final int score2 = 11;
        //score2 = 12; //final int 는 상수, 상수는 한번 입력된 값은 바꿀수가 없다
    }
}
